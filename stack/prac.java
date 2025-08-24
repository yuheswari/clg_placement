import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }


}
class stack{
    node top=null;
    void push(int val){
        node nn = new node(val);
        if(top==null){
            top=nn;
        }
        else{
            nn.next=top;
            top=nn;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.print("popped");
        }
        else{
            System.out.println("popped value is"+top.data);
            top=top.next;
        }
        
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        else{
            return top.data;
        }
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        node temp=top;
        System.out.print("Stack: ");
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

}
public class prac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        stack st = new stack();
        int ch =0;
        while(ch!=5){
            System.out.println("\n 1.push\n 2.pop \n 3.peek\n4.display\n 5.exit");
            System.out.println("Enter the choice:");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("ENter the element to push\n");
                    int val = sc.nextInt();
                    st.push(val);
                    break;

                case 2:
                    System.out.println("enter the element to pop:");
                    st.pop();
                    break;
                
                case 3:
                    System.out.println("enter the element in peek:");
                    int peek = st.peek();
                    if(peek!=-1){
                        System.out.println("top val is"+peek);
                    }
                    break;
                
                case 4:
                    st.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

            }
        }
    }
}