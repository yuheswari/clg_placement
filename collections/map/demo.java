import java.util.*;

class Group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        // Store all words first
        List<String> allWords = new ArrayList<>();
        
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            allWords.add(sc.nextLine());
        }
        
        // HashMap to group words by length
        Map<Integer, List<String>> wordGroups = new HashMap<>();
        
        // Process each word using for-each loop
        for (String word : allWords) {
            int length = word.length();
            
            // If length key doesn't exist, create new ArrayList
            if (!wordGroups.containsKey(length)) {
                wordGroups.put(length, new ArrayList<>());
            }
            
            // Add word to the appropriate length group
            wordGroups.get(length).add(word);
        }
        
        // Display grouped words using for-each
        System.out.println("\nWords grouped by length:");
        for (Integer length : wordGroups.keySet()) {
            List<String> words = wordGroups.get(length);
            System.out.print("Length " + length + ": [");
            
            // Print each word in the list
            for (String word : words) {
                System.out.print(word);
                if (!word.equals(words.get(words.size() - 1))) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
        sc.close();
    }
}