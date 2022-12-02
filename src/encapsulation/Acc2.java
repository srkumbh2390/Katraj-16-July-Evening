package encapsulation;

public class Acc2 {
	
	private double acc_balance2=123.5;
	
	public double getAccBalance2(int accNo) {
		return acc_balance2;
	}
	public void setBalance(double amt, int accNo) {
		if (accNo==2312) {
			acc_balance2+=amt;
		}
	}

	public static void main(String[] args) {
		

	}

}
