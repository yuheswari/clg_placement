import java.util.*;
class fibo {
    static int fibo(int n){
        if (n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fibo number:");
        int n= sc.nextInt();
        System.out.println(fibo(n));
    }

}
