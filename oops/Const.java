import java.util.Scanner;
public class Const{
    //step1 :construtor name is same as class name
    Const(String n ){ //parameterised constructor
        System.out.println(n+"hii");
    }

    Const(){
        System.out.println("Have the best day!!");
    }
    String name;
    void login(String name){
    this.name =name;
    System.out.println(name+"logined successfully!!");
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Const c =new Const("yuheswari");
        c.login("yuhes");
        Const c1 =new Const();


    }

}