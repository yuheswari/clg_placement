package placement;
import java.util.Scanner;
public class hours{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the min:");
        int totalmin=sc.nextInt();
        int hours=totalmin/60;
        int min=totalmin%60;
        System.out.println("The total hours is"+hours);
        System.out.println("The total min is"+min);
    }
}