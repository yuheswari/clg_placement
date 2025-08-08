// Find the most frequent element using a HashMap
// Input: [1, 2, 2, 3, 2, 1]
// Output: 2

import java.util.*;

class FrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        int result = 0;
        int maxCount = -1;
        boolean hasValue = false;

        
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int key = e.getKey();
            int count = e.getValue();
            if (!hasValue || count > maxCount) {
                maxCount = count;
                result = key;
                hasValue = true;
            }
        }

        if (hasValue) {
            System.out.println(result);
        }

        sc.close();
    }
}