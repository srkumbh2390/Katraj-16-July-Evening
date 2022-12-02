package loop;

public class NestedWhileTable {

	public static void main(String[] args) {
		System.out.print("Multiplication table\n");
		int i=1;
		while(i<=10){ 
		int j=1; 
		    while(j<=10){
		     System.out.print(i*j+"\t");
		     j++;
		            }
		            i++;
		            System.out.println();
		}
	}
}
