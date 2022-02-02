import java.util.*; 
import java.io.*;

class ABCheck {

  public static String ABCheck(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' ||  str.charAt(i) == 'b') {
        int count = 0;
        for (int j = i+1; j < str.length(); j++) {
          if (((str.charAt(j) == 'b' && str.charAt(i) == 'a') || (str.charAt(j) == 'a' && str.charAt(i) == 'b')) && count == 3) {
            return "true";
          }
          count++;
        }
      }
    }
    return "false";
  }

  public static void main (String[] args) { 
Scanner s = new Scanner(System.in);
    System.out.print(ABCheck(s.nextLine())); 
  }

}