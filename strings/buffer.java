import java.util.*;
import java.util.regex.*;
class buffer {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // String str = sc.nextLine();
        StringBuffer sb =new StringBuffer("hello");
        sb.append(" mom");
        System.out.println("Append:"+sb);

        sb.insert(5," super");
        System.out.println("insert:"+sb);
        
        sb.replace(6,11,"welcome");
        System.out.println("replace:"+sb);

        sb.delete(6,11);
        System.out.println("after delete:"+sb);

        sb.reverse();
        System.out.println("reverse"+sb);

        System.out.println("capacity"+sb.capacity());
        System.out.println("reverse"+sb.reverse());


    }}