package placement;
import java.util.Scanner;
import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read number of cards (array size)
        int a[] = new int[n + 1]; // Create array with one extra space for new card

        // Read the card values
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int pos = sc.nextInt(); // Read the position to insert the new card (1-based index)
        int val = sc.nextInt(); // Read the value of the new card

        // Check if position is valid (should be between 1 and n+1)
        if (pos < 1 || pos > n ) {
            System.out.println("invalid");
            return;
        }

        // Shift elements to the right to make space for new card
        for (int i = n - 1; i >= pos - 1; i--) {
            a[i + 1] = a[i];
        }

        // Insert the new card at the given position
        a[pos - 1] = val;

        // Print the updated array
        for (int i = 0; i <= n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}