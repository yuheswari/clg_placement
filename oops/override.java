class Animal{
    void sound(){
        System.out.print("animal makes sound");
    }

}
class dog extends Animal(){
    void sound(){
        System.out.print("dog braks");
    }


}
class cat extends Animal(){
    void sound(){
        System.out.print("cat sleeps");
    }
}

public class override{
    
    public static void main(String[]args){
        Animal a1 =new Animal();
        Animal a2 =new dog();
        Animal a3 =new cat();
    }
    sound.a1();
    sound.a2();
    sound.a3();
}