package inheritance;

public class AudiCar extends Car {
	String name = "Audi-Q4";
	String driveline="Right-Hand Drive";
	String  power="188 bhp @ 4200rpm";
	String torque="320 Nm @ 1500rpm";
	String mileage="14.93 kmpl";
	int drivingrange=896;
	String transmission="Automatic (DCT)-7 Gears";
	String emission="BS 6";
	int engine=1984;  // engine in cc
	double priceAudiQ4=44.89;   // price in lakh
	int topspeed=222;  // speed in kmph
	float acceleration=7.3f;
	int lengthmm=4485;
	int widthmm=1849;
	int heigtmm=1616;
	int wheelbasemm=2680;
	
	public void feature () {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Following are the features of AudiCar-Q4");
		System.out.println("1. There are 4 airbags in this audicar");
		System.out.println("2. Driving smooth because of shock absorber");
		System.out.println("3. It shows the overspeed warning 1 beep over 80kmph & continous beeps over 120kmph");
		System.out.println("4. Can be lock to car from long distance also");
		System.out.println("5. Can be open from the roof of car");
	}

	public static void main(String[] args) {
		
		AudiCar ac=new AudiCar();
		System.out.println("The model name of Audi Car is "+ ac.name + ". This car is the "+ ac.driveline+".");
		System.out.println("The power of this car is "+ ac.power + " and torque is " + ac.torque +".");
		System.out.println("Mileage is "+ ac.mileage+" drivingrange is "+ ac.drivingrange+"km.");
		System.out.println("Transmission is "+ ac.transmission+", emission is "+ ac.emission+" and engine is "+ ac.engine+" cc.");
		System.out.println("Top speed is "+ac.topspeed+" acceleration is "+ac.acceleration+".");
		System.out.println("Price of this Audi-Q4 is "+ ac.priceAudiQ4+"lakh.");
		System.out.println("Length = "+ac.lengthmm+"mm, width = "+ac.widthmm+"mm, height = "+ac.heigtmm+"mm and wheelbase = "+ac.wheelbasemm+"mm.");
		ac.feature();
		System.out.println(" ");
		ac.wheels();
		ac.brake();
		ac.seating();
		ac.driving();
		ac.fuelpetrol();
		ac.gear();
		ac.start();
	}
}
