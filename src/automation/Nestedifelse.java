package automation;

public class Nestedifelse {

	public static void main(String[] args) {
		
		boolean isMallopen = true;
		
		boolean isPVRopen = false;
		
		if(isMallopen) {
			
			if(isPVRopen) {
				
				System.out.println("Book the ticket for De Dhakka-2 Movie");
			}
			
			else {
				
				System.out.println("PVR is Closed");
			}
			
		}
		else {
		
			System.out.println("Currently Mall is close");
						
		}
	}

}

