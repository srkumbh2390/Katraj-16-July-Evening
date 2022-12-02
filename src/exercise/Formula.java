package exercise;

public class Formula {

	public static void rect(String name, int x, int y) {

		int area = x*y;
		int perimeter = 2*(x+y);
		
		System.out.println("Rectangle " + name + " with coordinates of "+x+ "," +y);
		
		System.out.println(area+"\n" + perimeter);

	}
	
	public static void main(String[] args) {
		rect("ABCD", 22, 33);
		rect("PQRS", 44, 55);
	}

}
