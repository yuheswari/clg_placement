package placement;
import java.util.Scanner;
import java.util.Arrays;
public class sum{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){  //input from the user 
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        System.out.print("The even number"+even);
        System.out.println("the odd "+odd);
    }
}