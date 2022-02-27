import java.util.Scanner;

public class Main3 {
    public static String TwoSum(int[] arr){
        int firstNum=arr[0];
        StringBuffer sBuffer=new StringBuffer();

        for(int i=1;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(firstNum==(arr[i]+arr[j])){
                    sBuffer.append(arr[i]);
                    sBuffer.append(",");
                    sBuffer.append(arr[j]);
                    sBuffer.append(" ");
                }
            }
        }
        if(sBuffer.length()==0){
            return "-1";
        }else{
            return sBuffer.toString();
        }
    } 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(TwoSum(s.nextLine()));
    }
}
