import java.util.Scanner;
public class switc{
    public static void main(String[]args){
        Scanner sc = new Scanner();
        System.out .print("Enter the year:");
        int a=sc.nextInt();
        switch(year%4 ==0 && year %100!=0)||(year%400==0){
            case 1:
            System.out.print("it is leap year");
            break;
            default:
                System.out.print("not a laep year");
            

        }
        


        

    }
}