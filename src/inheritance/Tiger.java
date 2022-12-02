package inheritance;

public class Tiger extends Animal {
	
		String animalName="Tiger";
		String ageanimal="6 years.";
		String live="Gupha";
		String speed="49 - 65 km/h";
		String mass="90 - 310 kg (Male, Adult)";
		String length="10 feet";
		
	public void facts () {
		System.out.println("1. Tiger is te largest wild cats in the world.");
		System.out.println("2. Tiger is cornivores, eating only meat.");
		System.out.println("3. Tiger is solitary hunters and generally search for food alone at night." );
		System.out.println("4. Tiger is good swimmers!.");
		System.out.println("5. Tiger's roar can be heard as far as three kilometers away.");
		System.out.println(" ");
	}
	public static void main(String[] args) {
		Tiger ta=new Tiger();
		ta.facts();
		System.out.println("Name of this animal is "+ ta.animalName+" and " + ta.ageanimal);
		System.out.println("This tiger live in the "+ ta.live+" and lengt is "+ta.length);
		System.out.println("Speed of the tiger is "+ ta.speed + " and mass is "+ ta.mass);
		System.out.println(" ");
		ta.talking();
		ta.drinking();
		ta.eating();
		ta.wildanimal();
		ta.outwater();
		}

}
