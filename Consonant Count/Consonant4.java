import java.util.Scanner;

public class Consonant4 {
    public static String ConsonantCount(String str) {
        //Delete uppercase and lowercase vowels
        str= str.replaceAll("[aeiouAEIOU]","");
        //Delete non-alphanumeric
        str= str.replaceAll("[^a-zA-Z0-9]","");
        return String.valueOf(str.length());
      }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(ConsonantCount(s.nextLine()));
    }
}
