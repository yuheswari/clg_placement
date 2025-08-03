import java.util.*;
import java.util.regex.*;
class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="pSNA";
        Pattern p = Pattern.compile("\\d+");
        Matcher m =p.matcher(s); //  \\D ->LETTERS \\d->Digits/numbers
        if(m.matches()){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}