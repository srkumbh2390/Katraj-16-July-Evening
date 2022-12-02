package assignment;

			//08.08.22-Q1-- student monitoring system-
			// less than 35 -- Fail
			// 35 to 50 -- Grade C
			// 51 to 70 -- Grade B
			// 71 to 85 -- Grade A
			// above 85 -- Grade A+

public class StudMonitoring0808001 {

	public static void main(String[] args) {
		System.out.println("Student Monitoring System. \nResult of Swapnil");
		
		int x = 98;
		
		if(x<=35) {
			System.out.println("Fail");
		}
		else if(x>=35 & x<=50) {
			System.out.println("Grade: C");
		}
		else if (x>=51 & x<=70) {
			System.out.println("Grade: B");
		}
		else if (x>=71 & x<=85) {
			System.out.println("Grade: A");
		}
		else if (x>=86 & x<=100) {
			System.out.println("Grade: A+");			
		}
		else {
			System.out.println("Invalid Data");
		}
	}

  }

