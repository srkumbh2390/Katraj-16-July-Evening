package constructor;

public class Car {

	String model ;
	String name;
	int accleration;
	
	public Car(String m, String n, int a) {
		
		model=m;
		name=n;
		accleration =a;		
	}
	public static void main(String[] args) {
		System.out.println("Model\t" + "Name\t" + "Accleration");
		
     Car var=new Car("BMW-VT", "BMW", 1000);
     
    
     System.out.println(var.model +"\t"+ var.name +"\t"+ var.accleration);

	}

}
