import java.util.Scanner;

class myqueue {
    int[] a;
    int n;
    int f = 0;   // front
    int r = -1;  // rear

    myqueue(int size) {
        n = size;
        a = new int[n];
    }

    void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            a[++r] = val;
        }
    }
    boolean isFull() {
        return r == n - 1;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(a[f++]); // print removed
        }
    }
    boolean isEmpty() {
        return f > r;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = f; i <= r; i++) { // for(i=f;i<=r;i++)
                System.out.println(a[i]);  // print front once
                break;
            }
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = f; i <= r; i++) { // for(i=f;i<=r;i++)
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int cap = sc.nextInt();
        myqueue q = new myqueue(cap);

        while (true) {
            System.out.println("\n1-Enqueue 2-Dequeue 3-Peek 4-Display 5-Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}