package arraypractice;

public class AverageArray {

	public static void main(String[] args) {
	       int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
	       
	       //calculate sum of all array elements
	       int sum = 0;
	       for(int i: numbers)
	        sum = sum + i;
	       
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is : " + average); 
	   }
	}

