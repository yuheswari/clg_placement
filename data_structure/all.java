class node{
    int data;
    node next;
}
class linkedList{
    node head=null,tail=null;
    node fh=null,sh=null;//for pallindrome
    node current=null,prev=null,next=null;
    void insert(int val){
        //crrating obj
        node nn = new node();
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next = nn;
            tail=nn;
        }}
        //if you directly used head to traverse, you’d lose the original starting point of your list because head would keep moving to head.next until it becomes null

        void display(){
            node temp =head;
            while(temp!=null){
                System.out.println(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        void findmid(){
            node slow =head,fast=head;
            while(fast.next!=null && fast.next.next!=null){
                sh=slow.next;
                slow.next=null;//breaks connection
            }
        }
        void reverse(){
            node reverse(node n){
                current=n;
                prev=null;
                next=null;
                while(current!=null){
                    //current to next
                    next=current.next; //saving the next node
                    current.next=prev;//reversing to the previous node
                    prev=current; // move prev to current (this node is now reversed)
                    current=next;// move cur forward to the saved next node
                
                }
                return prev;
            }
        }

        void pallindrome(){
            findmin();
            //reversing sh
            sh=reverse(sh);
            while(fh!=null && sh!=null){
                if(fh.data !=sh.data){
                    System.out.println("not a palli");
                }
                return;
                fh=fh.next;
                sh=sh.next;
            }
            System.out.println("its a pallindrome");

        }

        class SinglyLinkedListPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        int val;
        while (true) {
            val = sc.nextInt();
            if (val != -1) {
                ll.insert(val);
            } else {
                break;
            }
        }

        ll.display();
        ll.checkPalindrome();
    }
}


        
    

}