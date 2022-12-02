package ifelse;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		Scanner srk = new Scanner(System.in);
		System.out.println("Enter the age number");
			//defining an 'age' variable
		int age = srk.nextInt();
		srk.close();
		
		//Checking the age
		if(age<=18) {
			System.out.println("These age persons comes in CHILD");
		}
		
		else if(age>18 && age<=40) {
			System.out.println("These age persons comes in YOUNG");			
		}
		
		else if(age>40 && age<=60) {
			System.out.println("These age persons comes in ADULT");
		}
		
		else {
			System.out.println("These age persons comes in OLDAGE");
		}
	}

}
