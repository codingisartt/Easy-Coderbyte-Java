import java.util.Scanner;

public class Main {
    public static String SimpleEvens(long num){
        String str=String.valueOf(num);
        String[] numArr=str.split("");
        for(String n:numArr){
            if(Long.parseLong(n)%2!=0){
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(SimpleEvens(s.nextLine()));
    }
}