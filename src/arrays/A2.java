package arrays;

public class A2 {

	public static void main(String[] args) {
		
		int [] var = new int [6];
		var[0] = 55;
		var[1] = 50;
		var[2] = 60;
		var[3] = 48;
		var[4] = 52;
		var[5] = 58;
		
		int [] ref = {10, 20, 30, 40, 50};
		
		System.out.println(ref.length);
		for (int a=(ref.length-1); a>=0; a--) {
			System.out.println(ref[a]);
		}
	}

}
