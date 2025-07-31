import java.util.*;
import java.util.regex.*;
class withoutreturn {
    //with argument without return type
    static void isprime(int n){
        int prime =1;
        for(int i=2;i<n/2;i++){
            if(n%1==0){
                prime=0;
                break;
            }
        }
        if(prime==1){
            System.out.println(n+"isprime");
        }
        else{
            System.out.println(n+"not a prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        isprime(n);
    }}