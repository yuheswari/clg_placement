import java.util.*;

public class rem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original list: " + list);

        
        //LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> result = new ArrayList<>(set);
        for(int i:a){
            if(!b.contains(1)){
                b.add(i);
            }
        }
        

        System.out.println("List after removing duplicates: " + result);
    }
}