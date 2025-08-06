import java.util.*;
class inputmismatch{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        try{
            int n =sc.nextInt();
            System.out.println("You entered: " + n);
        }
        catch(InputMismatchException e){
            System.out.println("InputMismatchException: Please enter a valid integer.");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: An arithmetic error occurred.");
        }
        catch(Exception e){
            System.out.println("value is:"+e);

        }
        System.out.println("End of program");
    }
}