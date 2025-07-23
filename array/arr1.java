package placement;
import java.util.Scanner;
import java.util.Arrays;
public class arr1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int s1 =sc.nextInt();
        int s2 =sc.nextInt();
        int a1[]=new int[s1];
        int a2[]=new int[s2];
        if(s1!=s2){
            System.out.print("not same at beginning");
        }
        else{
            int sum1=0;
            int sum2 =0;
            for(int i=0;i<=s1;i++){
                a1[i]=sc.nextInt();
                sum1+=a1[i];
            }
            for(int i=0;i<=s2;i++){
                a2[i]=sc.nextInt();
                sum2+=a2[i];
            }
            
        }


    }
}