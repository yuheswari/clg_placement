import java.util.*; // added for Scanner

class node{
    int data;        // value
    node next;       // pointer
    node(int data){
        this.data=data;
        next=null;
    }
}

class linked{
    node head=null,tail=null;
    void insert(int val){
        node nn = new node(val); // create new node each call
        //to make conncetion
        if(head ==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }
    // merge two sorted lists and print result (minimal change from original intent)
    void merge(node l1,node l2){
        node dummy = new node(0); // placeholder head
        node h =dummy;
        while(l1!=null && l2!=null){// pick smaller
            if(l1.data>l2.data){ // l2 smaller
                dummy.next=l2;
                dummy=dummy.next;
                l2=l2.next;
            }
            else{ // l1 smaller or equal
                dummy.next=l1;
                dummy=dummy.next;
                l1=l1.next;
            }
        }
        if(l1!=null){
            dummy.next=l1;
        }
        if(l2!=null){
            dummy.next=l2;
        }
        node temp=h.next;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class merge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linked l1 = new linked();
        int val;
        while (true) {
            val = sc.nextInt();
            if (val != -1){
                l1.insert(val);
             }
             else{
                break;
            }
        }
        linked l2 =new linked();
        while(true){
            val = sc.nextInt();
            if(val!=-1){
                l2.insert(val);
            }
            else{
                break;
            }
        }
        l1.merge(l1.head,l2.head);
        sc.close();
    }
}