import java.util.Scanner;

public class Main2 {
    public static String TwoSum(int[] arr){
        int firstNumber=arr[0];
        String numberSum="";
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==firstNumber){
                    numberSum=numberSum+" "+String.valueOf(arr[i]);
                    numberSum=numberSum+","+String.valueOf(arr[j]);
                }
            }
        }
        if(numberSum.equals("")){
            return "-1";
        }
        return numberSum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(TwoSum(s.nextLine()));
    }
}
