package placement;
import java.util.Scanner;
public class greetings{
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your name:");
    String name =sc.nextLine();
    System.out.println("Enter your age:");
    int age =sc.nextInt();
    System.out.println("Hello"+name+"your age is"+age+"Thankyou for visiting our site!!");
    sc.close();
}
}