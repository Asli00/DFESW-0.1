package classmembers;

public class Car {
    //attributes 
	public String make;
	public String model;
	public int numOfDoors;
	public boolean hassSunRoof;

	//static class number -This means it belongs to the class NOT the objects
		public static int numOfCarsCreated = 0;
	
	//methods
	public Car(String make, String model, int numOfDoors, boolean hassSunRoof) {
		super();
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
		this.hassSunRoof = hassSunRoof;
		numOfCarsCreated++;
	}
		//*** to generate this got to: source, generate constructor filed, choose and finish***
	
	
public static void drive() {
	System.out.println("im driving!");
//			the only way that you access a method in a class or a property in a class, without first making the object is if its static
//	In java generally speaking, we always make objects first and then access the methods through the object
//	what static does is it allows me to access a method without making an object first
//Now can access the object statically, this is known as static access 
//	what t means by static is that it does not belong to the object but the whole class
//	if something is not static it cannot be accessed statically and can only be accessed through an object of that class. this would mean that you'd have to creat an object to get to it.
	}
}
