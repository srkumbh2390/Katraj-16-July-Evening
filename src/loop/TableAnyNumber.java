package loop;

		//we can create a multiplication table using while loop in Java language

import java.util.Scanner;

public class TableAnyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		int i=1;
		while( i<=10){
		System.out.println(num+"x"+i+"="+num*i);
		 i++;
		}
		sc.close();

	}

}
