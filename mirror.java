import java.util.*;
class mirror{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++){
            // Print spaces 
            for(int space = 1; space < i; space++){
                System.out.print(" ");
            }
            for(int val = 1; val <= n - i + 1; val++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}