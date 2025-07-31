import java.util.*;
class elements{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
        //     // Printing
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print("1");

        //     }
        //     System.out.println();
        // }
    }
}
}