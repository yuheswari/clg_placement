import java.util.*;
import java.util.regex.*;
class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="uk is a good girl";
        Pattern p =Pattern.compile("girl");//digits
        Matcher m =p.matcher(s);
        System.out.println(m);
        if(m.find()) {   //matches is an interface
            System.out.println("grouping:"+m.group());
            System.out.println("Starting index:"+m.start());
            System.out.println("Ending index:"+m.end());                                       //check wheather match or not
        }
        else{
            System.out.println("not valid");
        }
        
        


    }}