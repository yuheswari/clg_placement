import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        // Declaration of the array
        ArrayList<Integer> a = new ArrayList<Integer>();

        // Adding elements to the array
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        

        // To print the elements of the array
        System.out.println("Elements in the array: " + a);

        //sorting
        Collections.sort(a);
        System.out.println("Sorted array: " + a);

        // To get the size of the array
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element at index " + i + ": " + a.get(i));
        }

        // To change the value
        a.set(2, 100);
        System.out.println("After changing the value at index 2: " + a.get(2));

        // To remove the value
        a.remove(3);
        System.out.println("After removing the value at index 3: " + a);

        for (int val : a) {
            System.out.println(val + " ");
        }
    }
}