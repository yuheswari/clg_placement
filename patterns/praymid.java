import java.util.*;
class praymid{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++){
            // Print spaces
            for(int space = 1; space <=n-i+1; space++){
                System.out.print(" ");
            }
            
            for(int val = 1; val <= i; val++){
                System.out.print(count+" ");
                count ++;

            }
            System.out.println();
        }
    }
}