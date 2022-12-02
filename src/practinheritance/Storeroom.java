package practinheritance;
//Hierchical inheritance
public class Storeroom extends Banglow{
	public void store() {
		System.out.println("More space is available for Store---Storeroom");
	}
	public static void main(String[] args) {		
			Storeroom S=new Storeroom();
			S.show();
			S.store();
	}
}
