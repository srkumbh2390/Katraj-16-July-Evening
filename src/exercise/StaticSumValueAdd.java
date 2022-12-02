package exercise;

public class StaticSumValueAdd {
	
	public static int summation(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static void main(String[] args) {
		
		int sum1 = summation(10, 30);
		int anothersum = sum1+25;
		System.out.println(anothersum);
	}
	

}
