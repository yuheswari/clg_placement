import java.util.Scanner;

class Node{
    int data;
    Node next = null;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head = null, tail = null, fh = null, sh=null;

    void insert(int val){
        Node nn = new Node(val);
        if(head == null){
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
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


    void findMid(){
        Node slow = head, fast = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fh = head;
        sh = slow.next;
        slow.next = null;
    }   


    Node reverse(Node n){
        Node prev = null, next = null;
        Node cur = n;
        prev = next = null;

        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }


    void reorder(){
        findMid();

        sh = reverse(sh);

        Node dummy = new Node(0);
        Node h = dummy;
        while(fh!=null && sh!=null){
            dummy.next = fh;
            dummy = dummy.next;
            fh = fh.next;

            dummy.next = sh;
            dummy = dummy.next;
            sh = sh.next;
        }

        if(fh!=null){
            dummy.next = fh;
        }

        Node temp = h.next;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

}

class reorder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        int val;

        while(true){
            val = sc.nextInt();
            if(val == -1)
                break;
            else
                ll.insert(val);
        }

        ll.display();

        ll.reorder();
    }
}