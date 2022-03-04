import java.util.Scanner;

public class Main {
    public static int PowerSetCount(int[] arr){
        int result=(int) Math.pow(2, arr.length);
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(PowerSetCount(s.nextLine()));
    }
}