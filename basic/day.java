import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        String s=sc.nextLine();
        if(s.length()> t.length()){
            System.out.print(0);
            return;
        }
        int count =0;
        int i=0,j=0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                count+=1;
                i++;
                j++;

            }
            else{
                i++;
            }
        }
        if(count==length())
            System.out.print("1");
        else
            System.out.print("0")
    }}
