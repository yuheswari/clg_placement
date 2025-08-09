// //the person is travelling from place a to place b as the person starts his journey 
// he as to note the current time in hours h and miniutes m the task is to find the time
// lefft for him to reach the destination if cureent time is the value ec=xxceeding 24 h 
// the output should be the negative
//the output should be in 24 hr format

import java.util.*;
public class travel{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current time in hours:");
        int hours = sc.nextInt();
        System.out.println("Enter the current time in miniutes:");
        int miniutes = sc.nextInt();
         miniutes =(hours*60)+miniutes;
        if(miniutes>1440){
            System.out.print("the output should be in negative number");//60*24
            int negativeMinutes = miniutes - 1440;
            System.out.println("Negative minutes: " + negativeMinutes);
        }
        else{
            int remainingminutes = 1440 - miniutes;
            System.out.println("Remaining minutes: " + remainingminutes);
            int remainingHours = remainingminutes / 60;
            int remainingMinutes = remainingminutes % 60;
            System.out.println("Time left to reach the destination: " + remainingHours + " hours and " + remainingMinutes + " minutes");
        }
    }
}

