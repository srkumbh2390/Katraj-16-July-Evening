package encapsulation;

public class Layer1 {

	public static void main(String[] args) {
		Acc1 ac=new Acc1();
		
		//get balance
		System.out.println(ac.getAccBalance(1234));
		
		//update balance
		ac.setBalance(250, 2312);
		
		//get balance
		System.out.println(ac.getAccBalance(1234));
		
		//update balance
		ac.setBalance(5000, 2312);		

		//get balance
		System.out.println(ac.getAccBalance(1234));
				
				
	}

}
