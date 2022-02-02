import java.util.*;
import java.io.*;

public class Consonant3 {
    public static String ConsonantCount(String str){
        String consonantString="bcdfghjklmnpqrstvwyz";
        char[] consonants=consonantString.toCharArray();
        List<String> consonList=new ArrayList<String>();
        int countofTheConsonant=0;

        for(char consonant: consonants){
            consonList.add(String.valueOf(consonant));
        }
        for(char letter: str.toLowerCase().toCharArray()){
            if(consonList.contains(String.valueOf(letter))){
                countofTheConsonant++;
            }
        }
        str=String.valueOf(countofTheConsonant);
        return str;
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(ConsonantCount(s.nextLine()));
    }
}
