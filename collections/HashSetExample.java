import java.util.*;
class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(11);
        hs.add(67);
        hs.add(41);
        System.out.println("The values in the hash set are: " + hs);
        for (int val : hs) {
            System.out.println(val + " ");
        }

        // LinkedHashSet example
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(11);
        lhs.add(67);
        lhs.add(41);
        System.out.println("The values in the linked hash set are: " + lhs);
        for (int val : lhs) {
            System.out.println(val + " ");
        }

        // TreeSet example
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(11);
        ts.add(67);
        ts.add(41);
        System.out.println("The values in the tree set are: " + ts);
        for (int val : ts) {
            System.out.println(val + " ");
        }
    }
}