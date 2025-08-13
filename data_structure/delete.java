import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

class LinkedList{
    Node head=null, tail=null;

    // insert at last
    void insert(int val){
        Node nn = new Node(val);
        if(this.head == null){
            this.head = nn;
            this.tail = nn;
        } else {
            this.tail.next = nn;
            this.tail = this.tail.next;
        }
    }

    void insertAtBegin(int val){
        Node nn = new Node(val);
        if(head==null){
            head = tail = nn;
        }
        else {
            // System.out.println("Inserted at first");
            nn.next = head;
            head = nn;
        }
    }

    void deletionAtFirst(){
        if(head!=null){
            head = head.next;
        }
    }

    void deletionAtLast(){
        Node temp = head;

        while(temp.next.next != null){
            System.out.println("Temp is at " + temp.data);
            temp = temp.next;
            System.out.println("Temp moved to  " + temp.data);
        }

        if(tail.next == null){
            // System.out.println("Modifying Tail");
            tail = temp;
            tail.next = null;
            
        }
    }

    void  display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }   

}

public class delete{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Inserting Elements: ");
        while(true){
            int val = sc.nextInt();
            if(val==-1){
                break;
            } else {
                ll.insertAtBegin(val);
            }
        }

        ll.display();

        ll.deletionAtFirst();

        ll.display();

        ll.deletionAtLast();

        ll.display();
    }
}