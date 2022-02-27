import java.util.Scanner;

public class Main{
    public static String TwoSum(int[] arr){
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==arr[0]){
                    if(sb.length()>0){
                        sb.append(" ");
                    }
                    sb.append(arr[i]).append(",").append(arr[j]);
                }
            }
        }
        return sb.length()==0 ? "-1" : sb.toString();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(TwoSum(s.nextLine()));
    }
}
