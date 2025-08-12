import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        next=null;  
    }
}

class LinkedList{
    node head=null,tail=null;

    /*
     * LIST SHAPE (after several inserts):
     *  head                              tail
     *   |                                 |
     *   v                                 v
     *  [a] -> [b] -> [c] -> [d] -> ... -> [z] -> null
     *  Each node: [ value ]--next--> next node (or null)
     */

    void insert(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    /**
     * Reverses a singly linked list in-place starting from the given head node.
     *
     * This method iteratively traverses the list, reversing the direction of each
     * next pointer so that the list order is inverted.
     *
     * @param n the head node of the list to reverse; may be null for an empty list
     * @return the new head node of the reversed list, or null if the input was null
     *
     * @implNote Runs in O(n) time with O(1) extra space.
     */
    node rev(node n){
       // REVERSE VISUAL (before): X -> Y -> Z -> null
       // pass1: (X.next->null)   null <- X   Y -> Z -> null
       // pass2: (Y.next->X)      null <- X <- Y   Z -> null
       // pass3: (Z.next->Y)      null <- X <- Y <- Z (new head)
       node current =n;
       node prev = null;
       node next = null;
       while(current!=null){
           next = current.next;
           current.next = prev; // reverse
           prev = current;
           current = next;
       }
       return prev;

    }
    void checkpal(){
    // PALINDROME CHECK PHASES (in-place O(1) space):
    // 1) Find middle (slow/fast)
    // 2) Split & reverse second half
    // 3) Compare first half vs reversed second half
    // 4) (Optional) Conclude (no restore here)
    //
    // EXAMPLE: 1 2 3 2 1
    // slow/fast walk:
    //  s f
    // [1]->[2]->[3]->[2]->[1]
    //    s     f
    //       s        f(end)
    // slow at middle (3)
    // split after slow: first: 1->2->3   second: 2->1
    // reverse(second) => 1->2
    // compare columns: (1,1) (2,2) then second half ends => palindrome
        node slow = head;
        node fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node fh = head;
        node sh = slow.next;
        slow.next=null;//used to disconnect
        //step 2 reverse
        sh=rev(sh);
        //step 3 compare
        while(fh!=null && sh!=null){
            if(fh.data!=sh.data){
                System.out.println("Not a palindrome");
                return;
            }
            fh=fh.next;
            sh=sh.next;
        }
        System.out.println("Palindrome");
    }
}



public class pali{
    public static void main(String[] args) {
        // Test the palindrome checker
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int val;
        while(true){                 // read until -1
            val = sc.nextInt();       // next number
            if(val == -1) break;      // stop on sentinel
            ll.insert(val);           // insert normal value
        }
        ll.display();                 // show list
        ll.checkpal();                // check palindrome
        
    }
}

