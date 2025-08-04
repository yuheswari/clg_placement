class constructothw{
    String name;
    int age;
    constructothw(){
        System.out.print("default");
    }
    constructothw(String name){
    this.name =name;
    System.out.println("name"+name);}
    constructothw(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("name"+name+"age"+age);
    }
    public static void main(String[]args){
        constructothw s1=new constructothw();
        constructothw s2 =new constructothw("raji");
        constructothw s3 =new constructothw("raji",8);

        

    }
}