package placement;
import java.util.Scanner;
public static loo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while(n>0){
            int l = n%10;
            sum+=l;
            n=n/10;
            if(n==0 && sum>9){
                n=sum;
                sum=0;
            }


               
               }
    
}
}