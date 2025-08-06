import java.util.*;
class notallowed extends Exception{
    notallowed(String s){

        super(s);
    }
}

class custom{// custom throw
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        
        int venue =304;
        try{
            int std_cls =sc.nextInt();
            if(std_cls!=venue){
                throw new notallowed("check the venue");
            }
            else{
                System.out.println("have a great day");
            }

        }
        catch(Exception e){
            System.out.println("custom exception /n"+e);
        }
        finally{
            System.out.println("completed finally");
        }   }
}