class  myqueue(){
    void push(int val){
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(val);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    void pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{   
            q1.poll();
        }
    }
}

public class stack_using_two_queue{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

    }
}