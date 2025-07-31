package placement;
import java.util.*;
public class twhw{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float principle =sc.nextFloat();
        float rate =sc.nextFloat();
        float time =sc.nextFloat();
        float SI =(principle*rate*time)/100;
        System.out.println("The SI Is :"+SI);
    }
}