package practinheritance;
//Multilevel inheritance
public class Designer extends PM {
	
	public void design() {
		System.out.println("Designer design application as client requirement");
	}	

	public static void main(String[] args) {	
			Designer des=new Designer();
			des.BRS();
			des.SRS();
			des.Interact();
			des.monitor();
			des.estimation();
			des.design();
			
	}
}
