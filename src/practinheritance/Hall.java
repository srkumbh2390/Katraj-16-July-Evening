package practinheritance;
//Hierchical inheritance
public class Hall extends Banglow{
	public void area() {
		System.out.println("A huge area ");
	}

	public static void main(String[] args) {
			Hall H=new Hall();
			H.space();
			H.area();
	}

}
