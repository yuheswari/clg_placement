import java.util.Scanner;

// Node class - represents each element in the doubly linked list
class node {
    int data;     // Stores the value
    node next;    // Points to the next node
    node prev;    // Points to the previous node

    // Constructor to initialize the node
    node(int data) {
        this.data = data;
        next = prev = null; // No links yet
    }
}

// Linked list class - manages all nodes
class linked_list {
    node head = null, tail = null; // First and last nodes of the list

    // Method to insert a value at the end
    void insert(int val) {
        node nn = new node(val); // Create new node
        if (head == null) {      // If list is empty
            head = nn;
            tail = nn;
        } else {                 // If list already has elements
            tail.next = nn;      // Link old tail to new node
            nn.prev = tail;      // Link new node back to old tail
            tail = nn;           // Move tail to new node
        }
    }

    // Display list from head to tail
    void displayForward() {
        node temp = head;        // Start from first node
        while (temp != null) {   // Traverse until no more nodes
            System.out.print(temp.data + "<->");
            temp = temp.next;    // Move forward
        }
        System.out.println("null");
    }

    // Separate odd and even numbers into different lists
    void segregateOddEven() {
        linked_list evenList = new linked_list(); // For even numbers
        linked_list oddList = new linked_list();  // For odd numbers

        node temp = head; // Start from first node
        while (temp != null) {
            if (temp.data % 2 == 0) { // Even number
                evenList.insert(temp.data);
            } else {                  // Odd number
                oddList.insert(temp.data);
            }
            temp = temp.next; // Move to next node
        }

        // Display the results
        System.out.println("Even list:");
        evenList.displayForward();
        System.out.println("Odd list:");
        oddList.displayForward();
    }
}

// Main class - program execution starts here
public class doublylinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // For user input
        linked_list dl = new linked_list();   // Main doubly linked list
        int val;

        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            val = sc.nextInt(); // Read number
            if (val != -1) {    // If not stop signal
                dl.insert(val); // Add to list
            } else {
                break;          // End loop
            }
        }

        System.out.println("Original List:");
        dl.displayForward();    // Show original list

        dl.segregateOddEven();  // Show even and odd lists separately
    }
}
