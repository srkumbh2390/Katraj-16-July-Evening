package assignment;

import java.util.Scanner;

	// 10.08.2022--Q2 write switch case to get day name by entering no.
	//1--Monday, 2--Tuesday, 3--Wednesday, 4--Thursday, 
	//5--Friday, 6--Saturday, 7--Sunday

public class SwitchCase1008002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int day = sc.nextInt();
		sc.close();
		
		switch (day) {
		
		case 1 : System.out.println("Monday"); break;
		case 2 : System.out.println("Tuesday"); break;
		case 3 : System.out.println("Wednesday"); break;
		case 4 : System.out.println("Thursday"); break;
		case 5 : System.out.println("Friday"); break;
		case 6 : System.out.println("Saturday"); break;
		case 7 : System.out.println("Sunday"); break;
		default: System.out.println("Invalid Input"); break;
		
		}			
	}
}
