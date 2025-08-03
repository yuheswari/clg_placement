class hwmethodoverloading.java{

    void name(String name){
        System.out.println("name"+name);
    }
    void time(String name,String time){
        System.out.println("name"+name+"time"+time);
    }
    void city(String name,String time,String city){
        System.out.println("name"+name+"time"+time+"city"+city);
    }
    public static void main(String[] args)
    {
        hwmethodoverloading greetings = new hwmethodoverloading();
        greetings.name("aswin");
        greetings.time("aswin","goodmorning");
        greetings.city("aswin","goodmorning","chennai");
    }
}