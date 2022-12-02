package practinheritance;
// constructor used by using Constructor chaining rul 
// super(); this();  & super and this keyword
public class Cricket extends Game {
	int x=1000;
	public Cricket() {
		super();
		System.out.println(super.x);
		System.out.println(this.x);
		System.out.println("Constructor of Cricket");
	}
	public static void main(String[] args) {
		Cricket ckt=new Cricket();		
	}
}
