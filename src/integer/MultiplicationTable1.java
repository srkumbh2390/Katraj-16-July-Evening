package integer;

public class MultiplicationTable1 {

	public static void main(String[] args) {
				
		//Print table body
		for (int i = 1; i <= 9; i++) {
		System.out.print(i + " ! ");
		for (int j = 1; j <= 9; j++) {
		
		System.out.printf("%4d", i *j);				
		}
		System.out.println();
		
		}
			
		
	}

}
