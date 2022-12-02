package practinheritance;
// Is type inheritance
public class Class_X extends School {
	
	public void boy() {
		System.out.println("In 10th class there are 32 boys");
	}
    public void girl () {
    	System.out.println("In 10th class there are 22 girls");
    }
	public static void main(String[] args) {
		Class_X Ten=new Class_X();
		Ten.totalclass();
		Ten.playground();
		Ten.boy();
		Ten.girl();
	}

}
