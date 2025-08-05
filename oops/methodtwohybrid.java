//method two for hybrid

interface I1{
    void run();
}

class parent implements I1{
    void copy(){
        System.out.println("copying");
    }
    public void run(){
        System.out.println("running");
    }
}
public class methodtwohybrid extends parent{
    void write(){
        System.out.println("Writting");
    }
    public static void main(String[]args)
    {
        //creating obj
        methodtwohybrid obj = new methodtwohybrid();
        obj.run();
        obj.copy();
        obj.write();
    }
    
}