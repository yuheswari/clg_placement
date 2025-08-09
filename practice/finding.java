//find the 2nd max value in array
import java.util.*;
public class finding{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array:");
        for(int i=0; i<n; i++){ // Fixed loop condition
            arr[i] = sc.nextInt();
        }
        if(n<2){
            System.out.println("Array should have at least 2 elements.");
        }
        else{
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i]>max){
                    secondMax = max;
                    max = arr[i];
                }
                else if(arr[i]>secondMax && arr[i]!=max){
                    secondMax = arr[i];
                }
            }
            if(secondMax == Integer.MIN_VALUE){
                System.out.println("There is no second largest element in the array.");
            } else {
                System.out.println("The 2nd largest element in the array is: " + secondMax);
            }
        }
    }
}