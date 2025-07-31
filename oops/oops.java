import java.util.Scanner;
public class oops{
    String name ="uk";

    void login(){
        System.out.println(name+" logined successfully");
    }
    void logout(){
        System.out.println(name+"logeed out");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        oops dummy = new oops();
       dummy.login();
        dummy.logout();

    }
}