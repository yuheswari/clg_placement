class grandparent{
    void walking(){
        System.out.println("my grand pa goes for walking everyday!");
    }
    void drive(){
        System.out.println("my grandpa is good at driving");
    }
}

class parent extends grandparent{ //multilevel inheritance
    void drive(){
        System.out.println("my father is good at driving");
    }
}

public class multilevel extends parent{
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