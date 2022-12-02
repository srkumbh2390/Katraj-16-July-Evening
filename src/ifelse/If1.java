package ifelse;

public class If1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 25;
		
		if(x+y>20) {
			
		System.out.println("x + y is greater than 20");
		}
		else if (x+y==20) {
			System.out.println("x + y is equal to 20");
		}
		else {
			System.out.println("x + y is less than 20");
		}
	}
}
