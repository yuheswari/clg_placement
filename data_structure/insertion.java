import java.util.Scanner;

// Node class - represents each element in the doubly linked list
class node {
    int data;     
    node next;    
    node prev;    

    node(int data) {
        this.data = data;
        next = prev = null;
    }
}

// Linked list class
class linked_list {
    node head = null, tail = null;

    // Insert at the beginning
    void insertAtBeginning(int val) {
        node nn = new node(val);  // Create new node
        if (head == null) {       // If list is empty
            head = tail = nn;
        } else {
            nn.next = head;       // Link new node to old head
            head.prev = nn;       // Link old head back to new node
            head = nn;            // Move head to new node
        }
    }

    // Insert at the end
    void insertAtEnd(int val) {
        node nn = new node(val);
        if (head == null) {       // If list is empty
            head = tail = nn;
        } else {
            tail.next = nn;       // Link old tail to new node
            nn.prev = tail;       // Link new node back to old tail
            tail = nn;            // Move tail to new node
        }
    }

    // Display forward
    void displayForward() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class
public class doublylinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linked_list dl = new linked_list();

        System.out.println("Enter numbers to insert at the end (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val != -1)
                dl.insertAtEnd(val);
            else
                break;
        }

        System.out.println("Enter numbers to insert at the beginning (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val != -1)
                dl.insertAtBeginning(val);
            else
                break;
        }

        System.out.println("Final List (forward):");
        dl.displayForward();
    }
}
                
                