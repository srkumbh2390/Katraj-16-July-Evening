package practinheritance;
//Hierchical inheritance
public class Bedroom extends Banglow{
	public void bed() {
		System.out.println("Bed size is 6.5x6ft");
	}
	public static void main(String[] args) {
		Bedroom B=new Bedroom();
		B.location();
		B.bed();
	}

}
