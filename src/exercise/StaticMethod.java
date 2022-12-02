package exercise;

public class StaticMethod {
	
	public static void summation(int x, int y) {
		
		int sum = x+y;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		
		StaticMethod.summation(120, 150);
		

	}

}
