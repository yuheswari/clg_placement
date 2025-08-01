class methodoverloading{ //if we has more method with same name is method overloading

    void login(){
        System.out.println("welcome to kraybin");
    }

    void login(String name){
        System.out.println("name of student is:"+name);
    }
    void login(int id){
        System.out.println("the student id is:"+id);
    }
    public static void main(String[]args){
        //Creating an object
        methodoverloading m = new methodoverloading();
        m.login();
        m.login("uk");
        m.login(123);
    }
    
}