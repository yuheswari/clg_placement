import java.util.Scanner;
class Differnce{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int iteration =100000;
        long starttime = System.nanoTime();
        for(int i=0;i<iteration;i++){
            sb.append("Students");
        }
        long endtime =System.nanoTime();
        long timelimit =endtime-starttime;

        System.out.println("string builder:"+timelimit);
        StringBuffer sbu =new StringBuffer();
        int itera =100000;
        long st =System.nanoTime();
        for(int i=0;i<itera;i++){
            sbu.append("student");
        }
        long et =System.nanoTime();
        long tl=et-st;
        System.out.println("String Buffer:"+tl);
    }}