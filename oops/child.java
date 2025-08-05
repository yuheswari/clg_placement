class parent{ //single inheritance
    void drive(){
        System.out.println("my father is good at driving");
    }
}

public class child extends parent{
    void code(){
        System.out.println("iam good at coding");
    }
    public static void main(String[]args){
        //creating the obj
        child obj1 =new child();
        obj1.drive();
        obj1.code();
    }
    
}