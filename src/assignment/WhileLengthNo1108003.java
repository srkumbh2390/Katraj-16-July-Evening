package assignment;

	//11.08.2022 --Q3- Print length of given no?- int  x=12345;
public class WhileLengthNo1108003 {

	public static void main(String[] args) {
		
		int x = 0, y = 12345;
		
	while(y != 0) {
		
		//y = y/10
		y=y/10;
		x++;
	}
	
	System.out.println("Total Number of Digits: " + x);

	}
}
