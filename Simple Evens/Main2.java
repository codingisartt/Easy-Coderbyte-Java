import java.util.Scanner;

public class Main2 {
    public static String SimpleEvens(Long num){
        Long l=Long.valueOf(num);
        String[] digits=l.toString().split("");
        for(int i=0;i<digits.length;i++){
            if(Long.parseLong(digits[i])%2 !=0){
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
