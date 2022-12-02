package encapsulation;

public class Acc {

	//Data members -hide
		private double acc_balance=2500.25;
		
		//getter method
		public double getBalance(int acNo) {		
			return acc_balance;
		}	
		//setter method
		public void setBalance(double amt, int accNo) {		
			if (accNo==1234) {			
				acc_balance =acc_balance + amt;
			}
		}	
	}
