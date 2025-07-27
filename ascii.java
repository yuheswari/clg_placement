package placement;
import java.util.Scanner;
public class ascii{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the character that need to be conert as ascii value:");
        char as=sc.next().charAt(0);
        int ascii =(int)as;
        System.out.println("the ascii value is"+ascii);

    }
}