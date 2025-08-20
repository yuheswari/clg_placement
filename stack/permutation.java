import java.util.*;
public class permutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> ip = new LinkedList<>();
        Queue<Integer> op = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            ip.add(val);
        }
        for(int i = 0; i < n; i++){
            op.add(sc.nextInt());
        }
        //to check given value is in satack permutation or not
        int count =0;
        for(int i=0;i<n;i++){
            stack.push(ip.peek());
            while(!stack.isEmpty()&&stack.peek()==op.peek()){
                stack.pop();
                op.poll();
                count+=1;
            }
            ip.poll();
        }
        if(count==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}