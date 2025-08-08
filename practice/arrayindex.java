import java. util .*;
public class arrayindex{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the size of an array");
        int size =sc.nextInt();

        int[]arr =new int[size];
        arr[0]=10;

        System.out.println("Enter the array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the index");
        int index = sc.nextInt();
        System.out.println("the value od index is:"+index);

        System.out.println("Enter the divisor:");
        int divisor =sc.nextInt();
        System.out.print("The value of the divisor is:"+divisor);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("you have commited the array index out of bound exception"+e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.print("you have commited the index out of bound exception" + e);
        }
        catch(ArithmeticException e){
            System.out.println("You have commited arithemetic exception"+e);

        }
        catch(Exception e){
            System.out.print("your code contains some exceptions");
        }
        System.out.print("code ends");


    }
}