import java.util.*;

class compute {
    static int compute(int n){
        if(b==0){
            return 1;

        }
        else{
            return a*(compute(a,b-1));

        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.print("Enter the number:/n"+a+"and"+b);
        System.out.println(compute(a,b));
    }
}

   
   