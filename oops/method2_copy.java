class method2_copy{
    String name;
    int id;
    method2_copy(String name ,int id){
    this.name =name;
    this.id =id;
    System.out.println(name);
    }

    method2_copy(method2_copy obj1){
    this.name =name;
    this .id =id;
    System.out.print(name); }


    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        method2_copy obj1 = new method2_copy("aswin",123);
        method2_copy obj2 = new method2_copy("uk",567);
        obj2.id=obj1.id;
        System.out.println(obj2.id);
    }
}