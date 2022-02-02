import java.util.*; 
import java.io.*;

class Consonant2 {

  public static int ConsonantCount(String str) {
    // code goes here  
    String s=str.toLowerCase();
    int count=0;
    for(int i=0; i<s.length();i++){
        char c=s.charAt(i);
        if(c!='a' && c!='i' && c!='e' && c!='o' && c!='u'){
            if( (int) c>=97 && (int) c<=122)
                count++;
        }
    }
    
    return count;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ConsonantCount(s.nextLine())); 
  }

}
