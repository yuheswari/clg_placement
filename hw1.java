package placement;
import java.util.Scanner;
public class hw1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number a:");

        int a =sc.nextInt();
        System.out.println("Enter the number b:");

        int b= sc.nextInt();
        System.out.println("a+b ="+(a+b));
        System.out.println("a-b ="+(a-b));
        System.out.println("a*b ="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        System.out.println("a++ ="+(a++));
        System.out.println(a);
        System.out.println("++a ="+(++a));
        System.out.println("--a ="+(--a));
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("condition1 && condition2 = " + (condition1 && condition2));
        System.out.println("condition1 || condition2 = " + (condition1 || condition2));
        System.out.println("!condition1 = " + (!condition1));

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        int c = 10;
        c += 5;
        System.out.println("c += 5 = " + c);
        c -= 2;
        System.out.println("c -= 2 = " + c);
        c *= 3;
        System.out.println("c *= 3 = " + c);
        c /= 9;
        System.out.println("c /= 9 = " + c);
        c %= 2;
        System.out.println("c %= 2 = " + c);

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}