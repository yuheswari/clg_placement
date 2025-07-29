import java.util.*;
import java.util.regex.*;
class testmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mail =sc.nextLine();
        String reg ="^[A-Z a-z 0-9 ._+-]+@+[A-Z a-z .]+\\.[A-Z a-z]{2,}$"; //minimum {2,}
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(mail);
        if(m.matches()){
            System.out.println("Vaild mail id");
        }
        else{
            System.out.println("In valid mail id try aagain!!!");
        }
    }}