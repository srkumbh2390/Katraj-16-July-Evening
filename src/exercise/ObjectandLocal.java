package exercise;

public class ObjectandLocal {
	
	int x = 20;

	public static void main(String[] args) {
		
		ObjectandLocal ref = new ObjectandLocal();
		
		int local = ref.x;
		
		System.out.println(local);
		
	}

}
