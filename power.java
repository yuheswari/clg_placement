package placement;
import java.util. Scanner;
public class power{
    Scanner sc = new Scanner(System.in);
    int unit =sc.nextInt();
    if(unit<=200)
        System.out.println("RS."+(int)(unit*0.5));
    elseif(unit <=400)
        System.out.println("RS."+(int)(unit*0.65+100));
    elseif(unit<=600)
        System.out.println("RS."+(int)(unit*0.80+200));
    elseif(unit>600)
        System.out.println("RS."+(int)(unit*0.5));
        
}