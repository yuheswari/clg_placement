interface I1{
    void display();
}
interface I2{
    void print();
}

public class inter implements I1,I2{
    public void display(){
        System.out.println("displaying");
    }
     public void print(){
         System.out.println("printing");
    }
    public static void main(String[]args){
        //craeting obj
        inter obj1 =new inter();
        obj1.display();
        obj1.print();
    }
}