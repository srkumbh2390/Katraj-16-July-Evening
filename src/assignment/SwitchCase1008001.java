package assignment;
	//10.08.2022 --Q1- Print the month name with following days using switch case-
	//for 28 ---> feb 
	//for 30 --> April, june, Sept..Nov
	//for 31 ---> Jan, March, May, July, August, Oct, Dec 		

import java.util.Scanner;

public class SwitchCase1008001 {

	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter days in Month");		
		int month = ref.nextInt();
		
		switch (month) {
		
		case 28 : System.out.println("February"); break;
		case 30 : System.out.println("April, June, September, November"); break;
		case 31 : System.out.println("January, March, May, July, August, Octomber, December");break;
		default : System.out.println("Invalid Input"); break;
		}
		ref.close();

	}

}
