import java.util.*;
class recur {
    // with argument and with return
    static boolean isprime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isprime(n)){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " not a prime");
        }
    }
}