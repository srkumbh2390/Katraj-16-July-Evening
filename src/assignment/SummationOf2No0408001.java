package assignment;

//04.08.2022--Q1--Summation of two no--takes output-- and subtract from another no.

public class SummationOf2No0408001 {
	
	public static int summation(int x, int y) {
		int sum = x+y;
		return sum;
	}

	public static void main(String[] args) {
		
		int sum1 = summation(750, 225);
		int anotherno = 2000;
		
		System.out.println("Sum of x & y is: " + sum1 + "\nSubtract x & y from Another No.: "+(anotherno - sum1));
		
	}

}
