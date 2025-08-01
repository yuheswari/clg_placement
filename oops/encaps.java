class encaps{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in){
            String name =sc.nextLine();
            int age =sc.nextInt();
            encaps obj1 = new encaps();
            obj1.setname(name);
            obj1.setage(age);
            System.out.println(obj1.getname);


        }

    }
}