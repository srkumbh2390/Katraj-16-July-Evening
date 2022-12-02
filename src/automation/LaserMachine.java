package automation;

public class LaserMachine {
	//State - Variable
	int l = 15;
	String color="Red";
	String J="Japan";
	int cost=5;
	String M="Laser Machine";
	String C="Amada Company";
	String T="years";
		//Action Method
	public void cutting() {
		System.out.println(M + " color is " + color);
		System.out.println("Cost of " + M + " is " + cost+"cr");
		System.out.println(M + " made by " + C);
		System.out.println(C + " located in " + J);
		System.out.println("The life of " + M + " is " + l + T);
		System.out.println(M + " is used for cutting sheets as well as pipe in various shape");		
	}
		public static void main(String[] args) {
		//Object Create
		LaserMachine var=new LaserMachine();
		var.cutting();
	}
}

