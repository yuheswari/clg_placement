package placement;
import java.util.Scanner;
public class zigzag{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int num = 1;
        for(int i = 0; i < rows; i++){
            if(i==0 || i=ro){
                for(int j = 0; j < cols; j++){
                    arr[i][j] = num++;
                }
            } else {
                for(int j = cols - 1; j >= 0; j--){
                    arr[i][j] = num++;
                }
            }
        }
        // Print zigzag pattern
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}