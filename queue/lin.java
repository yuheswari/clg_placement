import java.util.Scanner;

class myqueue {
    private class node {
        int data;
        node next;
        node(int d) { data = d; }
    }

     node front = null;
     node rear  = null;

    void enqueue(int val) {
        node nn = new node(val);
        if (front == null) {
            front = rear = nn;
        } else {
            rear.next = nn;
            rear = nn;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("over");
        } else {
            System.out.println(front.data); // print removed
            front = front.next;
            if (front == null) rear = null;
        }
    }

    boolean isEmpty() {
        return front == null;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }
}

public class lin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myqueue q = new myqueue();

        System.out.print("How many to enqueue: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            q.enqueue(sc.nextInt());
        }

        System.out.print("Queue: ");
        q.display();

        System.out.print("How many to dequeue: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) q.dequeue();

        System.out.print("Queue after dequeue: ");
        q.display();

        q.peek();
        sc.close();
    }
}