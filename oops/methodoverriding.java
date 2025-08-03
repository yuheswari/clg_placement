class methodoverriding{

    class psna{
        void login(){
            System.out.println("Welcome to PSNA:");
        }
    }


    public class Leetsuccess extends psna{
        void login(String name){
            System.out.println("Nmae is :"+name);
        }

    }
    public static void main(String[]args){
        //need to access the child class as obj
        Leetsuccess m = new Leetsuccess();
        m.login();
        m.login("uk");

    }
}