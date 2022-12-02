package controlstatements;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the day");
			String day = ref.next();
			
			switch (day) {
			
			case "Monday" : System.out.println("Day-1"); break;
			case "Tuesday" : System.out.println("Day-2"); break;
			case "Wednesday" : System.out.println("Day-3"); break;
			case "Thursday" : System.out.println("Day-4"); break;
			case "Friday" : System.out.println("Day-5"); break;
			case "Saturday" : System.out.println("Day-6"); break;
			case "Sunday" : System.out.println("Day-7"); break;
			default : System.out.println("Invalid Input"); break;
			
			}
			ref.close();
	}

}
