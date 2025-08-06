abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    void sound(){
        System.out.println("Meeow");
    }
}

public class ab {
    public static void main(String[]args){
        Animal mydog = new Dog();
        mydog.sound();
        mydog.eat();

        Animal mycat = new Cat();
        mycat.sound();      
        mycat.eat();
    }
}
