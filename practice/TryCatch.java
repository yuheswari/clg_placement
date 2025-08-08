public class TryCatch {
    public static void main(String[] args) {
        try{
            int a=7;
            int b=0;
            int c =a/b;
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Arithmetic exception occured"+e);
        }
        System.out.println("program ends");
    }
}