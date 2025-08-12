import java.util.*;

// Node class represents each element in the linked list
//
//  +------+     +------+     +------+
//  | data | --> | data | --> | data | --> null
//  +------+     +------+     +------+
//     ^
//   head
//
// Node: one box in the chain
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
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
// LinkedList: manages the chain
//
// Quick visual:
// [head] -> [2]->[5]->[8]->null
class LinkedList {
    Node head = null, tail = null;

    // Add value at end
    void insert(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    // Print the list
    void display() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + "-> ");
        System.out.println("null");
    }

    // Count even numbers, toughlish style
    int countEvens() {
        int count = 0;
        for (Node temp = head; temp != null; temp = temp.next)
            if (temp.data % 2 == 0) count++;
        return count;
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
public class Linked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        int val;
        while (true) {
            val = sc.nextInt();
            if (val == -1) break;
            li.insert(val);
            li.display();
        }
        System.out.println("Number of even numbers: " + li.countEvens());
    }
}