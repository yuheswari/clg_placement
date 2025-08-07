import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort_alphabetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); //getting the input

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            a1.add(sc.nextLine());
        }

        // Sort alphabetically
        Collections.sort(a1);

        System.out.println("Sorted strings (alphabetical order):");
        for (String val : a1) {
            System.out.println(val);
        }
    }
}