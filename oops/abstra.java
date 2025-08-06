interface i1{
    void copy();
}
interface i2 extends i1{
    void paste();
}
public class abstra implements i1,i2{
    public void copy(){
        
        System.out.println("can copy");
    }
    public void past(){
        System.out.print("can paste");
    }
}
    public static void main(String[]args){
        abstra obj =new abstra();
        obj.copy();
        obj.paste();
    }
