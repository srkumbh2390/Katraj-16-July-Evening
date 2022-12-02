package exception;

public class Throw1 {

	public static void login(String username, String pass) throws Exception  {
		if (username.equals("srk@gmail.com") && pass.equals("srk123")) {
			System.out.println("Successfully login");
		}
		else {
			throw new Exception ("Username or Password is incorrect");
		}
	}
		public static void main(String [] args) throws Exception {
			login("srk@gmail.com", "srk123");
		}
		

	}


