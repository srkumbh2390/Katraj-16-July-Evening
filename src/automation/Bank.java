package automation;

public class Bank {
	String account1;
	String account2;	
	byte minwithdraw;
	boolean answer;
	short minbalmaintain;
	int amtbal;
	long accountno;
	float deductbyupi;
	double bankannualcharge;
	char city;
	
	public void Withdraw() {
		System.out.println("1. "+account1+ " account no is " + accountno+ ". ");		
		System.out.println("2. Limit of "+account1+ " minimum balance maintain is " +minbalmaintain+" Rs. ");
		System.out.println("3. "+account1+" withdraw amount minimum is "+minwithdraw+" Rs. ");
		System.out.println("4. Total balance of "+account1+" account is "+amtbal+" Rs. ");
		System.out.println("5. In "+account1+" transfer money by UPI deduct charge of "+deductbyupi+" Rs. ");
		System.out.println("6. There is annual charge of "+account1+" is "+bankannualcharge+" Rs. ");
		System.out.println("7. "+account1+" live in "+city+" city. ");
		System.out.println("8. By ATM From "+account1+" more than "+minwithdraw+ " Rs amount can be withdraw. -- "+ answer);	
		
	}	
	public void NotWithdraw() {
		System.out.println("==============================================================================================");
		System.out.println("1. "+account2+ " account no is " + accountno+ ". ");		
		System.out.println("2. Limit of "+account2+ " minimum balance maintain is " +minbalmaintain+" Rs. ");
		System.out.println("3. "+account2+" withdraw amount minimum is "+minwithdraw+" Rs. ");
		System.out.println("4. Total balance of "+account2+" account is "+amtbal+" Rs. ");
		System.out.println("5. In "+account2+" transfer money by UPI deduct charge of "+deductbyupi+" Rs. ");
		System.out.println("6. There is annual charge of "+account2+" is "+bankannualcharge+" Rs. ");
		System.out.println("7. "+account2+" live in "+city+" city. ");
		System.out.println("8. By ATM From "+account2+" less than "+minwithdraw+ " Rs amount can be withdraw. -- "+answer);
	}
	public static void main(String[] args) {
		
		Bank a1=new Bank();
		//String
		a1.account1="Bank1";
		//byte
		a1.minwithdraw=100;
		//Boolean
		a1.answer=true;
		//short
		a1.minbalmaintain=1000;
		//int
		a1.amtbal=2364902;
		//long
		a1.accountno=1234567890;
		//Float
		a1.deductbyupi=11.75f;
		//double
		a1.bankannualcharge=248.65;
		//char
		a1.city='A';
		
		a1.Withdraw();		
		
		Bank a2=new Bank();
		a2.account2="Bank2";
		a2.minwithdraw=100;
		a2.answer=false;
		a2.minbalmaintain=5000;
		a2.amtbal=5624587;
		a2.accountno=1357924680;
		a2.deductbyupi=35.85f;
		a2.bankannualcharge=537.15;
		a2.city='B';		
		
		a2.NotWithdraw();	
	}
}
