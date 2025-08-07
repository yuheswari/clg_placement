import java.util.*;
class checking_dupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!hs.add(num)) {
                System.out.println("Duplicate found: " + num);
            } else {
                a.add(num);
            }
        }

        System.out.println("Unique numbers: " + a);
    }
}