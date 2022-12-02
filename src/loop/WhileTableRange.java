package loop;

import java.util.Scanner;

public class WhileTableRange {

	public static void main(String[] args) {
		
		Scanner srk = new Scanner(System.in);
		int num, range;
		
		System.out.println("Enter the number");
		num = srk.nextInt();
		
		System.out.println("Enter the range");
		range = srk.nextInt();
		
		int x=1;
	while (x<=range) {
		
		System.out.println(num +"x"+x+"="+num*x);
		x++;
	}
	srk.close();
	}
}
