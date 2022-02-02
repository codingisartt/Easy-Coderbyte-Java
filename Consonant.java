import java.util.*; 
import java.io.*;

class Consonant {

  public static int ConsonantCount(String str) {
    // code goes here  
    String consonants="bcdfghjklmnprstvyzxwBCDFGHJKLMNPRSTVYZXW";
    int counter=0;
    for(int i=0; i<=str.length()-1;i++){
      for(int j=0; j<=39;j++){
        if (str.charAt(i) == consonants.charAt(j))
          counter++;
      }
    }
    
    return counter;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ConsonantCount(s.nextLine())); 
  }

}
