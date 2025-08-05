import java.util.*;

public class dummy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int houses = sc.nextInt();
        int[] houseNumber = new int[houses];
        int[] position = new int[houses];

        for(int i=0; i<houses; i++){
            houseNumber[i] = sc.nextInt();
            position[i] = sc.nextInt();
        }

        for(int i=0; i<houses-1; i++){
            for(int j=0; j<houses-i-1; j++){
                if(position[j] > position[j+1]){
                    int temp = position[j];
                    position[j] = position[j+1];
                    position[j+1] = temp;
                    
                    //swap

                    temp = houseNumber[j];
                    houseNumber[j] = houseNumber[j+1];
                    houseNumber[j+1] = temp;
                }
            }
        }


        int diff = 0, index = 0;

        for(int i=0; i<houses-1; i++){
            if(diff < position[i+1] - position[i]){
                diff = position[i+1] - position[i];
                index = i;
            } 
        }

        System.out.println(Math.min(houseNumber[index], houseNumber[index+1]) +" " + Math.max(houseNumber[index], houseNumber[index+1]));

    }
}