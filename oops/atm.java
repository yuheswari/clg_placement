
import java.util.*;
class ATM{
	private String name;
	private Double bal;

	public void setname(String name) {
        this.name =name;
		
	}
	public void setbal(Double bal) {

        this.bal=bal;
		
	}
	public void deposit(Double amt) {
        bal=bal+amt;
		
	}
	public void withdrawl(Double amt) {
        if(amt>bal){
            System.out.println("insufficient balance");
        }
        else{
            bal=bal-amt;
            System.out.println("withdrawed successfully");
        }
		
	}
	public double getbal() {
		return bal;
	}
}
public class atm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ATM obj=new ATM();
        String name=in.nextLine();
        Double bal=in.nextDouble();
        obj.setname(name);
        obj.setbal(bal);
        int choice;
        double amt;
        do {
        	System.out.println("Enter your choice");
        	System.out.println("1.Deposit\n2.Withdraawl\n3.Check bal\n4.Exit");
        	choice=in.nextInt();//3
        	if(choice==1) {
        		amt=in.nextDouble();
        		obj.deposit(amt);
        	}
        	else if(choice==2) {
        		amt=in.nextDouble();
        		obj.withdrawl(amt);
        	}
        	else if(choice==3) {
        		System.out.println("Balance is Rs."+obj.getbal());
        	}
        }while(choice!=4);
        System.out.println("thankyou for visiting us");
    }
}
