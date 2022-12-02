package encapsulation;

public class Acc1 {
	//data member hide
	private double acc_balance=525.60;
	
	//getter method
	public double getAccBalance(int accNo) {		
	return acc_balance;
	}
	//setter method
	protected void setBalance(double amt, int accNo) {
		if (accNo==2312) {
			acc_balance+=amt;
		}
		else {
			System.out.println("Invalid Acc No.-------setBalance");		
	}

	
	}
}
