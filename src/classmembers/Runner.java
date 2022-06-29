package classmembers;

public class Runner {

	public static void main(String[] args) {
		//Car myCar = new Car("Skoda", "model", 5, false);
		//myCar.drive();
		//Car.drive();
	System.out.println("Number of cars" +Car.numOfCarsCreated);
	
	Car myCar = new Car("Skoda", "Octavia", 5, false);
	
	System.out.println("Number of Cars:" + Car.numOfCarsCreated);
	
	Car bmwM4 = new Car("BMW", "M4", 3, true);
	
	System.out.println("Number of Cars: " + Car.numOfCarsCreated);
	
	
		
	}
	
}
