import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input size
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        int[] payments = new int[n];

        // 2. Input payments
        System.out.println("Enter payments (30, 60, or 120):");
        for (int i = 0; i < n; i++) {
            payments[i] = sc.nextInt();
        }

        // 3. Initialize counters for 30 and 60 rupee notes
        int count30 = 0;
        int count60 = 0;

        // 4. Process each payment
        for (int i = 0; i < n; i++) {
            int payment = payments[i];

            if (payment == 30) {
                // No change needed
                count30++;
            } 
            else if (payment == 60) {
                // Need 30 change
                if (count30 > 0) {
                    count30--;
                    count60++;
                } else {
                    System.out.println("Transaction Failed at customer " + (i + 1));
                    return;
                }
            } 
            else if (payment == 120) {
                // Need 90 change
                if (count60 > 0 && count30 > 0) {
                    count60--;
                    count30--;
                } else if (count30 >= 3) {
                    count30 -= 3;
                } else {
                    System.out.println("Transaction Failed at customer " + (i + 1));
                    return;
                }
            } else {
                System.out.println("Invalid payment amount at customer " + (i + 1));
                return;
            }
        }

        // 5. If all successful
        System.out.println("Transaction Successful");
    }
}