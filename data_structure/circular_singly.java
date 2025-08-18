import java.util.Scanner;
import java.util.ArrayList;

// Singly Circular Linked List in the requested format
class node{
    int data;
    node next;
    node(int data){ this.data = data; }
}

class linked_list{
    node head = null, tail = null;

    // insert at end (maintain circular: tail.next == head)
    void insert(int val){
        node nn = new node(val);
        if(head == null){
            head = tail = nn;
            nn.next = head; // circle of one
        } else {
            nn.next = head;   // new node points to head
            tail.next = nn;   // old tail points to new
            tail = nn;        // move tail
        }
    }

    // forward display: one full cycle starting from head
    void display1(){
        if(head == null){
            System.out.println("null");
            return;
        }
        node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != head);
        System.out.println("(back to head)");
    }

    // reverse display (singly list has no prev: collect then print reverse)
    void display2(){
        if(head == null){
            System.out.println("null");
            return;
        }
        ArrayList<Integer> vals = new ArrayList<>();
        node temp = head;
        do{
            vals.add(temp.data);
            temp = temp.next;
        } while(temp != head);
        for(int i = vals.size()-1; i >= 0; i--){
            System.out.print(vals.get(i) + (i>0?"<-":""));
        }
        System.out.println();
    }
}

public class circular_singly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        linked_list cl = new linked_list();
        while(sc.hasNextInt()){
            int val = sc.nextInt();
            if(val == -1) break;
            cl.insert(val);
        }
        cl.display1();
        cl.display2();
        sc.close();
    }
}
