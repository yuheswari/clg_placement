package placement;
import java.util.Scanner;
import java.util.Arrays;
public class arrtwo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int [n][n];
        for(int i=0;i<n;i++){
            a[i][j]=sc.nextInt();

        }
        for(int i=1;i<n;i++){
            for(j=0;j<i;j++){
                if(a[i][j]!=0){
                    System.out.print("not");
                    return;
                }
            }
        }
        System.out.print("upper");


    }
}