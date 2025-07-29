import java.util.*;
import java.util.regex.*;
class Regexlearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="uk";
        Pattern p =Pattern.compile("\\D+");//digits
        Matcher m =p.matcher(s);
        if(m.matches()) {
            System.out.println("valid");//check wheather match or not
        }
        else{
            System.out.println("not valid");
        }
        
        


    }}