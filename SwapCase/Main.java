import java.util.Scanner;

public class Main {
    public static String SwapCase(String str){
        String returnVal="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                returnVal+=Character.toLowerCase(str.charAt(i));
            else returnVal += Character.toUpperCase(str.charAt(i));
        }
        return returnVal;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(SwapCase(s.nextLine()));
    }
}
