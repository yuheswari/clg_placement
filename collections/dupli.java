import java.util.*;

import java.util.Scanner;

public class sort_alphabetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (!set.add(str)) {
                System.out.println("Duplicate found: " + str);
            } else {
                a1.add(str);
            }
        }

        // Sort alphabetically
        Collections.sort(a1);

        System.out.println("Sorted unique strings (alphabetical order):");
        for (String val : a1) {
            System.out.println(val);
        }
    }
}