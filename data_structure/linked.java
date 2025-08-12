import java.util.*;

// Node class represents each element in the linked list
//
//  +------+     +------+     +------+
//  | data | --> | data | --> | data | --> null
//  +------+     +------+     +------+
//     ^
//   head
//
class node {
    int data; // Value stored in the node
    node next; // Reference to the next node

    // Constructor to create a new node with given data
    node(int data) {
        this.data = data;
        next = null;
    }
}

// ll class manages the linked list (insertion, display, and even count)
//
// Example after inserting 2, 5, 8:
//  head
//   |
//   v
//  +---+    +---+    +---+
//  | 2 |--->| 5 |--->| 8 |--->null
//  +---+    +---+    +---+
//
class ll {
    node head = null, tail = null; // head points to first node, tail to last

    // Insert a new value at the end of the list
    void insert(int val) {
        node nn = new node(val); // Create a new node
        //to make a connection
        if (head == null) { // If list is empty
            head = nn; // New node is now head
            tail = nn; // and also tail
        } else {
            tail.next = nn; // Link last node to new node
            tail = nn; // Update tail to new node
        }
    }

    // Display all elements in the list
    void display() {
        node temp = head; // Start from head
        while (temp != null) { // Traverse till end
            System.out.print(temp.data + "-> "); // Print data
            temp = temp.next; // Move to next node
        }
        System.out.println("null"); // End of list
    }
}

//     // Count and print the number of even numbers in the list
//     void printEvenCount() {
//         int count = 0;
//         node temp = head;
//         while (temp != null) {
//             if (temp.data % 2 == 0) {
//                 count++;
//             }
//             temp = temp.next;
//         }
//         System.out.println("Number of even numbers: " + count);
//     }
// }

// Main class to run the program
//
// Input example:
// 2 5 8 -1
// Output:
// 2-> null
// 2-> 5-> null
// 2-> 5-> 8-> null
// Number of even numbers: 2
public class linked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll li = new ll(); // Create a linked list object
        int val;
        // Keep taking input until user enters -1
        while (true) {
            val = sc.nextInt(); // Read value
            if (val == -1) {
                break; // Stop if -1 is entered
            } else {
                li.insert(val); // Insert value into list
            }
            li.display(); // Show current list after each insertion
        }
        // // Print the number of even numbers in the list
        // li.printEvenCount();
    }
}