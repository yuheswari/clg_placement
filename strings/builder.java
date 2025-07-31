import java.util.Scanner;
class Builder{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //StringBuilder sb = new StringBuilder("Practice");
        StringBuffer sb =new StringBuffer("practice");
        System.out.println("StringBuffer" +sb);
        sb.replace(0,3,"makes");
        System.out.println("After replace: " + sb);
        System.out.println(sb.hashCode());
        sb.append(" Everyone perfect");
        System.out.println(sb);
        sb.insert(5,"morning all");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        //delete method range
        sb.delete(0,3);
        System.out.println("deleting the range:"+sb);
        sb.deleteCharAt(3);
        System.out.println("deleting the single word:"+sb);

        


    }
}