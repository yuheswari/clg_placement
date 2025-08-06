import java.util.*;
public class tes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try { 
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n < 0) {
                throw new IllegalArgumentException("Negative number not allowed.");
            }
            try{
                System.out.println("Enter the division:");
                int d = sc.nextInt();
                if(d==0){
                    throw new ArithmeticException("cannot divide by 0");
                }
                System.out.println("Result:"+(n/d));
            }
            catch(ArithmeticException e){
                System.out.print("Arithementic exception inside the inner try");
            }

            }
            catch(IllegalArgumentException e){
                System.out.println("the argu is iligally starts");
            }
            catch(Exception e){
                System.out.println("common exception");
            }
            finally{
                System.out.println("finnaly the program got ends!!");
            }
        

    }
}