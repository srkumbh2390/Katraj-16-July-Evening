package automation;

public class Instance {
	
	//Instance Variable
	int x = 40;

	public static void main(String[] args) {
		// int local = x;
		Instance ref = new Instance();
		System.out.println(ref.x);

	}

}
