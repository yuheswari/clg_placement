import java.util.Scanner;
public class Const{
    //step1 :construtor name is same as class name
    Const(){
        System.out.println("hii");
    }
    String name;
    void login(String name){
    this.name =name;
    System.out.println(name+"logined successfully!!");
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Const c =new Const();
        c.login("yuhes");
    }

}