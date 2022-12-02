package encapsulation;

public class Layer {
	public static void main(String[] args) {		
		Acc ref=new Acc();		
		
		//get balance
		System.out.println(ref.getBalance(5555));
		
		//update balance
		ref.setBalance(1500, 5555);
		
		//get balance
		System.out.println(ref.getBalance(2584));
	}
}
