package automation;

public class Bulb {
	String name1;
	String name2;
	int price;
	boolean answer;
	int capacity;
	public void Switchon() {
		System.out.println(name1+ " who's capacity & price is "+ capacity + ","+price+" respectively is on?" + " "+answer);
	}
	public void Switchoff() {
		System.out.println(name1+ " who's capacity & price is "+ capacity + ","+price+" respectively is on?" + " "+answer);
	}
	
	public static void main(String[] args) {
		
		Bulb b1=new Bulb();
		b1.name1="bulb1";
		b1.price=360;
		b1.answer=true;
		b1.capacity=18;
		
		b1.Switchon();
		
		Bulb b2=new Bulb();
		b2.name1="bulb2";
		b2.price=240;
		b2.answer=false;
		b2.capacity=12;
		
		b2.Switchoff();
	}
}
