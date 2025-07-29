import java.util.*;
import java.util.regex.*;
class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="uk is a good girl";
        Pattern p =Pattern.compile("uk");//digits
        Matcher m =p.matcher(s);
        if(m.find()) {   //matches is an interface
            System.out.println("valid");//check wheather match or not
        }
        else{
            System.out.println("not valid");
        }
        
        


    }}