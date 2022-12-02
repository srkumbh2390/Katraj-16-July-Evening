package encapsulation;

public class Layer2 {

	public static void main(String[] args) {
		Acc2 ref=new Acc2();
		
		System.out.println(ref.getAccBalance2(1234));
		
		ref.setBalance(5, 2312);
		
		System.out.println(ref.getAccBalance2(1234));
		
		ref.setBalance(20, 2312);
		
		System.out.println(ref.getAccBalance2(1234));
		
		ref.setBalance(20, 2312);
		
		System.out.println(ref.getAccBalance2(1234));
		
		ref.setBalance(5, 2312);
		
		System.out.println(ref.getAccBalance2(1234));
		
		ref.setBalance(20, 2312);
		
		System.out.println(ref.getAccBalance2(1234));
		
		ref.setBalance(20, 2312);
		
		System.out.println(ref.getAccBalance2(1234));
	}

}
