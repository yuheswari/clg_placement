import java.util.*;

class group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");  // Fixed: 'in' → 'sc'
        HashMap<Integer,List<String>> hm = new HashMap<>();  // Fixed: 'Hashmap' → 'HashMap'

        for(String word : str){
            int length = word.length();
            hm.putIfAbsent(length, new ArrayList<>());  // Fixed: '1' → 'length'
            hm.get(1).add(word);  // Fixed: '1' → 'length'
        }
        System.out.println(hm);
    }
}