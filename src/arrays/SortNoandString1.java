package arrays;

import java.util.Arrays;

public class SortNoandString1 {

	public static void main(String[] args) {
		
		int [] MyMarks = {75,85,92,87,78,95};
		
		String [] MySubjects= {"English", "Marathi", "GFC", "Theory1", "Theory2", "Theory3"};
		
		
		System.out.println("Original Marks Sequence : " +Arrays.toString(MyMarks) );
		Arrays.sort(MyMarks);
		System.out.println("Marks in Ascending Sequence : "+Arrays.toString(MyMarks));
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println("Original Subject Sequence : "+Arrays.toString(MySubjects));
		Arrays.sort(MySubjects);
		System.out.println("Subjects name in Ascending Sequence : "+Arrays.toString(MySubjects));

	}

}
