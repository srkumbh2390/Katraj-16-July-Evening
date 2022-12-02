package practinheritance;
//has type inheritance
 public class Superident {
	Hostel hos;
	public Superident () {
		hos=new Hostel();
	}	
	public void food() {
		hos.living();
		hos.eachroom();
		System.out.println("Superident provide food for stuents");
	}
	public void attendance() {
		System.out.println("Superident take daily attendance");
	}
	public static void main(String[] args) {
			Superident sup =new Superident();
			sup.food();
			sup.attendance();
	
		
	}
}
