import java.util.*;
class node {
    int data;
    node next;
    node(int data) {
        this.data = data;
        this.next = null;
    }
}
class stack {
    node top = null;
    void push(int val) {
        node nn = new node(val);
        nn.next = top;
        top = nn;
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped value is " + top.data);
            top = top.next;
        }
    }
    boolean isEmpty() {
        return top == null;
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }
    void display() {
        node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class using_linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creates a Scanner object to read user input from the command line
        stack st = new stack(); // Creates a new stack object to perform stack operations
        int ch = 0; // Initializes the variable 'ch' to store the user's menu choice
        while (ch != 5) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit"); // Displays the menu
            System.out.print("Enter your choice: "); // Prompts user for choice
            ch = sc.nextInt(); // Reads user's choice
            switch (ch) {
                case 1:
                    System.out.print("Enter value to push: "); // Prompts for value to push
                    int val = sc.nextInt(); // Reads value
                    st.push(val); // Pushes value onto stack
                    break;
                case 2:
                    st.pop(); // Pops top value from stack
                    break;
                case 3:
                    int peekVal = st.peek(); // Gets top value
                    if (peekVal != -1)
                        System.out.println("Top value is: " + peekVal); // Displays top value
                    break;
                case 4:
                    st.display(); // Displays all values in stack
                    break;
                case 5:
                    System.out.println("Exiting..."); // Prints exit message
                    break;
                default:
                    System.out.println("Invalid choice"); // Handles invalid choices
            }
        }
    }
}