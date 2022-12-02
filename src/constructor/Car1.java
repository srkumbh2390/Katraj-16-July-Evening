package constructor;

public class Car1 {
	String model ;
	String name;
	int accleration;
	
	public Car1(String m, String n, int a) {
		
		model=m;
		name=n;
		accleration =a;		
	}
	public static void main(String[] args) {
		System.out.println("Model\t" + "Name\t" + "Accleration");
		
     Car1 var=new Car1("BMW-VT", "BMW", 1000);
     
     Car1 var1 =new Car1("Audi-HM", "Audi", 2000);  
     System.out.println(var.model +"\t"+ var.name +"\t"+ var.accleration);
     System.out.println(var1.model +"\t"+ var1.name +"\t"+ var1.accleration); 

	}
}
