package placement;
import java.util. Scanner;
public class year{
    Scanner sc = new Scanner(System.in);
    int year =sc.nextInt();
    if(1900<=year && 9999>=year){
        int month=sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30");
                break;
            case 2:
            if((year%400 ==0)||(year%4==0 && year%100!=0))
            System.out.print("leap");
            else{
                System.out.print("not a leap");
            }
            break;
            default:
                System.out.print("invalidmonth");
            
        }
        else{
            System.out.print("Invalid year");
        }
    }
}
