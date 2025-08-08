import java.util.*;

class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        System.out.println(hm);
    }
}