package practinheritance;

public class Private {
	//Variable 
	//Method
	private int x=20;
	private void P1() {
		System.out.println("This is private-P1---Method");
	}
	public static void main(String[] args) {
		Private pvt=new Private();
		pvt.P1();

	}

}
