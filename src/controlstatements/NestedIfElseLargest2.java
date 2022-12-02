package controlstatements;

public class NestedIfElseLargest2 {

	public static void main(String[] args) {
		
		int GST1 = 27, GST2 = 18, GST3 = 12;
		
		if(GST1 >= GST2) {			
			if(GST1 >= GST3) {				
				System.out.println(GST1 + "% is the highest amount deduct by tax.");
			}
			
			else {				
				System.out.println(GST3 + "% is the highest amount deduct by tax.");
			}
		}
		
		else {			
			if(GST2 >= GST3) {				
				System.out.println(GST2 + "% is the highest amount deduct by tax.");
			}			
			else {				
				System.out.println(GST3 + "% is the highest amount deduct by tax.");
			}				
		}		
	}
}
