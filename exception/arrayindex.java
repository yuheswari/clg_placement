import java.util.*;
class arrayindex{
    public static void main(String[]args){
try{
    int a[]=new int[5];
    c=in.nextInt();
    a[5]=c;
}
catch(ArithmeticException e){
    System.out.println("ArithmeticException: An arithmetic error occurred.");
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
}
catch(Exception e){
    System.out.println("value is:"+e);
}
}
}