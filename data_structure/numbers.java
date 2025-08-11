import java . util .*;
class node{
    int data;
    node next;
    //creating constructor
    node(int data){
        this.data=data;
        node next;
    }

}

class linked_list{
    node head = null, tail = null;
    void insert(){
        node nn =new node();
        if(head ==null){
            head =nn;
            tail=nn;
        }
        else{
            tail.next =nn;
            tail =nn;
        }
    }

}

void printEvenCount(){
    int count =0;
    node temp =head;
    while(temp !=null){
        if(temp.data %2 ==0){
            count++;
        }
        temp = temp.next;
    }
    System.out.println("Count of even numbers: " + count);
}

public class numbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        linked_list ll = new linked_list();
        int val;
        while(true){
            val =sc .nextInt();
            if (val == -1){
                break;
            }
            else{
                ll.insert(val);
            }
            ll.display();
        
        }
        ll.printEvenCount(); // Call to print even count

    }

}