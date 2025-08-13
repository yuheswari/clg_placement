import java.util.Scanner;
class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data=data;
        next=prev=null;
    }
}

class linked_list{
    node head=null,tail=null;
    void insert(int val){
        node nn = new node(val);
        if(head ==null){
            head =nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }

    }
    void display1(){
        node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    void display2(){
        node temp =tail;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

}
public class doublylinked{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        linked_list dl = new linked_list();
        int val;
        while(true){
            val = sc.nextInt();
            if(val !=-1){
                dl.insert(val);
            }
            else{
                break;
            }
        }
        dl.display1();
        dl.display2();  
    }
}