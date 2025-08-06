 interface owner {
    void name();


 }
 interface i2{
    void company();
 }

class lorry{
    void size(){
        System.out.println("big size");
    }
     void colour(){
        System.out.println("pink colour");
    }

    public void company(){

           System.out.println("company is ABC");
    }
}
class vechile extends lorry{
    void colour(){
        System.out.println("red colour");
    }
    public void name(){
        System.out.println("owner is Raj");
    }
    

}

public class hy{
    public static void main(String[]args){
        vechile v =new vechile();
        v.colour();
        v.name();
        v.size();
        v.company();
    
    }
}
