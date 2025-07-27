//age greater than 20
//weight greater than 40
//weigth greater than 100 exta rope is needed
package placement;
import java.util. Scanner;
public class day2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        int weight=sc.nextInt();
        if(age>20 && weight>40){
            if(weight>100){
                System.out.print("Eligible but extra rope is needed");
            }
            else{
                System.out.print("Eligible");
            }
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}