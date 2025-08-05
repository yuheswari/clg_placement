interface I1{
    void hod();
}
interface I2{
    void placementofficer();
}

class staff implements I1,I2{
    void whom(){
        System.out.println("iam the staff of"+name);
    }
    void work(){
        System.out.println("iam the staff my work is to take care of childerns");
    }
    public void hod(){
        System.out.println("iam the hod");
    }
    public void placementofficer(){
        System.out.println("iam the placement officer for"+name);
    }
}
class parent extends staff{
    void whom(){
        System.out.println("iam the parent of"+name);

    }
}

public class student extends parent(){
    
    void name(){
        System.out.println("My name is"+name);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String na =sc.nextLine();
        //creating obj
        student obj =new student();
        obj.name();
        obj.whom();
        obj.work();
        obj.hod();
        obj.placementofficer();
    }
}