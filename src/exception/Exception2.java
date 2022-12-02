package exception;

public class Exception2 {

	public static void main(String[] args) {
		
		System.out.println("Statment 1");		
		try {		
			//risky code
		System.out.println("risky code-inside try block");
		System.out.println(10/0);
		System.out.println("After risky code statment ");		
		}
		catch (ArithmeticException ex) {
			//body of catch
			System.out.println("inside catch block");
			//method form throwable class which print trace of exception
			ex.printStackTrace();
			
		}
		finally {			
			System.out.println("clean up code--inside finally block");
		}	
		System.out.println("Statment 2");
	}
}
