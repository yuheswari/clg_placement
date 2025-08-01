class overloading{
    overloading(String comp){
        System.out.println(comp+" welcomes you all");

    }
    overloading(int tym){
        System.out.println("at today"+tym+"pm");
    }
    overloading(String con,int hour){
        System.out.println("concept is"+con+"for"+hour+" hours");
    }

    public static void main(String[]args){
        overloading obj1 =new overloading("kraybin academy");
        overloading obj2 =new overloading(8);
        overloading obj3 =new overloading("regext",2);
    }
}