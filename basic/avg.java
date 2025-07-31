package placement;
import java.util.Scanner;
public class avg{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 =sc.nextInt();
        System.out.println("Enter the number 2:");

        int num2 =sc.nextInt();
        int sum =num1+num2;
        int average =sum/2;
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+average);
    }
}