interface I1{
    void copy();
}

class parent{
    void display(){
        System.out.println("displaying");
    }
}

public class hybrid extends parent implements I1{
    void write(){
        System.out.println("Writting");
    }
    public void copy(){
        System.out.println("copying from interface");
    }
    public static void main(String[]args){
        //creating obj
        hybrid obj =new hybrid();
        obj.write();
        obj.copy();
        obj.display();
    }
}