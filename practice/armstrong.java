// Armstrong number checker (works for any number of digits)
//
// What is an Armstrong number?
// - A number that equals the sum of each of its digits raised to the power of the number of digits.
//   Example: 153 has 3 digits -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//
// Visual (153):
//  +-----+     +-----+     +-----+
//  |  1  | --> |  5  | --> |  3  |
//  +-----+     +-----+     +-----+
//     |            |            |
//     v            v            v
//    1^3         5^3          3^3
//     |            |            |
//     +------------+------------+
//                   |
//               153 (sum)
//
// The program below:
// 1) Reads an integer input.
// 2) Counts the number of digits.
// 3) Extracts digits one by one, raises each to the power of the digit count, and accumulates a sum.
// 4) Prints a step-by-step trace so you can see the calculation.
// 5) Compares the sum with the original number and prints the result.

import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num; // Keep original value for final comparison

        // 1) Count digits (handle 0 as 1 digit)
        int digits = 0;
        int temp = num;
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
        }

        // 2) Compute Armstrong sum with a step-by-step trace
        int sum = 0;
        temp = num; // reuse temp to extract digits
        int step = 1;
        System.out.println("\nTrace (digit^" + digits + ") and running sum:") ;
        // For negative numbers, use absolute value for digit extraction (optional for learning)
        int work = Math.abs(temp);
        while (work != 0) {
            int digit = work % 10; // last digit
            // Raise digit to the power of number of digits
            int part = (int)Math.pow(digit, digits);
            sum += part;
            System.out.println("Step " + step + ": digit=" + digit + ", " + digit + "^" + digits + "=" + part + " -> sum=" + sum);
            work /= 10; // drop last digit
            step++;
        }

        // Special case when input is 0: loop above doesn't run; 0 is an Armstrong number (0^1 = 0)
        if (original == 0) {
            sum = 0;
            System.out.println("Step 1: digit=0, 0^1=0 -> sum=0");
        }

        // 3) Result
        System.out.println();
        if (sum == Math.abs(original)) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}