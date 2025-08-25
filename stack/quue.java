import java.util.*;

class QueueStack {
    Stack <Integer> st1 = new Stack<>();
    Stack <Integer> st2 = new Stack<>();

    void enqueue(int data){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        st1.push(data);

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    void dequeue(){
        if(st1.isEmpty()){
            System.out.println("Underflow");
        } else {
            st1.pop();
        }
    }

    void peek(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
        } else {
            st1.peek();
        }
    }

    void display(){
         if(st1.isEmpty()){
            System.out.println("Queue is Empty");
        } else {
            System.out.println(st1);
        }
    }
}

class QueueUsingTwoStack{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        QueueStack q = new QueueStack();

        while(true){
            System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.display\n5.exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}