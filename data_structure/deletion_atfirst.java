class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        next=null;
    }

}

class linked_list{
    node head=null,tail=null;
    void insert(int val){
        node nn = new node();
        if(head ==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next =nn;
            tail.nn;
        }

        void display(){
            node curr = head;
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        void deletion_atfirst(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            head = head.next;
        }


    }


}

public class deletion_atfirst{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        linked_list li = new linked_list();
        int val;
        while(true){
            val=sc.nextInt();
            if(val==-1){
                break;

            }
            else{
                li.insert(val);
            }
            li.display();
            li.deletion_atfirst();
            li.display();

        }
        
    }

}