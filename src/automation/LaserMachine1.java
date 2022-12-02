package automation;

public class LaserMachine1 {
	//State - Variable
		int l = 15;
		String color="Red";
		String J="Japan";
		int cost=5;
		String M="Laser Machine";
		String A="Amada";
		
			//Action Method
		public void cutting() {
			System.out.println(M + " color is " + color + ". Cost of "+ M + " is " +cost+"cr. "
					+ "" + M +" made by " +  A + " Company. " + A + " Company located in " 
					+ J + ". The life of " + M + " is " + l + "years. "
					+ M + " is used for cutting sheets as well as pipe in various shape.");
		}
	public static void main(String[] args) {
		//Object Create
				LaserMachine1 var=new LaserMachine1();
				var.cutting();
				
	}

}
