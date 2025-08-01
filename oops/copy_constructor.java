import java.util.*;
class copy_constructor{

    //golbal variable
    String name;
    int age;

    copy_constructor(String name,int age){
        this name =name;
        this age =age;
        System.out.println("Student name:"+name+"age:"+age);
    }
    copy_constructor(copy_constructor obj1){
        this name =obj1.name;
        this age =obj1.age;
        System.out.println("age is:"+age);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int a =sc.nextInt();
        //creating obj
        copy_constructor obj1 =new copy_constructor(s_name,s_age);
        //creating obj2
        copy_constructor obj2 =new copy_constructor(obj1); //copyconsrtu

    }
}