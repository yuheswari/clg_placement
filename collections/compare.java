import java.util.*;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first list
        System.out.print("Enter number of elements in first list: ");
        int n1 = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        System.out.println("Enter elements for first list:");
        for (int i = 0; i < n1; i++) {
            a1.add(sc.nextInt());
        }

        // Input for second list
        System.out.print("Enter number of elements in second list: ");
        int n2 = sc.nextInt();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        System.out.println("Enter elements for second list:");
        for (int i = 0; i < n2; i++) {
            a2.add(sc.nextInt());
        }

        // Find common elements
        ArrayList<Integer> common = new ArrayList<Integer>(a1);
        common.retainAll(a2);

        System.out.println("First list: " + a1);
        System.out.println("Second list: " + a2);
        System.out.println("Common elements: " + common);
    }
}