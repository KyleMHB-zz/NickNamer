/**
 * @author              :KyleMHB
 * Project Number       :0001
 * Project Name         :Nick Namer
 * IDE                  :NETBEANS
 * Goal of Project      -
 * Use a given name and create a nick name using an extension.
 */
package nicknamer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class NickNamer {

public static void main(String[] args) {
    String word = getName("Enter your name!");
    List<String> nickExtension =  Arrays.asList("anosorus","asaur","asaurus","onosorus","apede");
    String output=getRandomNick(truncateName(word,"AEIOUaeiou",2),nickExtension);
    showOutput(word+" your Nickname is "+output);
}
      
private static String getName(String prompt){
    return JOptionPane.showInputDialog(null,prompt);
}
  
private static String truncateName(String word,String vowels, int position) {
    char[] wordArray = word.toCharArray();
    int iterate=position;
    while(iterate!=word.length()){
    if(vowels.indexOf(wordArray[iterate]) < 0){
        return word.substring(0,iterate+1);  
    }else{iterate++;}
    }
    return word.substring(0,position);
}

private static String getRandomNick(String word,List nickExtension) {
    Random r = new Random();
    return word + nickExtension.get (r.nextInt(nickExtension.size() - 0));
}

private static void showOutput(String output) {
    JOptionPane.showMessageDialog(null,output);
}
}