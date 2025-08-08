import java.util.*;

class Group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> a = new ArrayList<>(); // storing all the words
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLine());
        }
                
        Map<Integer, List<String>> wordGroups = new HashMap<>();

        for(String word:a){
            System.out.println(word);

        }

     //create the hashmap
     HashMap<String> b = new HashMap<>();
    for(String val:a){
        if (!a.containsKey(length)) {
                a.put(length, new ArrayList<>());
            }
            //adding to the appopirate 
            a.get(length).add(word);
    }
    for(int length:a.keySet()){
        System.out.print("Length"+length);
    }
        


    }
}