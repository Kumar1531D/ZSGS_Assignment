package assignment_MethodOverriding;

public class VehicleHierarchy {

	public static void main(String[] args) {
		Vehicle bike = new Bike("Harley");
		Vehicle car = new Car("THAR");
		
		bike.getDetails();
		bike.start();
		bike.stop();
		
		System.out.println();
		
		car.getDetails();
		car.start();
		car.stop();

	}

}

class Vehicle{
	
	private String name;
	private String type;
	
	Vehicle(String name,String type){
		this.name = name;
		this.type = type;
	}
	
	public void start() {
		System.out.println("The Vehicle is starting");
	}

	public void stop() {
		System.out.println("The Vehicle is stopping");
	}
	
	public void getDetails() {
		System.out.println("Vehicle Name : "+name+"\nVehicle Type : "+type);
	}
	
}

class Bike extends Vehicle{
	
	Bike(String name){
		super(name,"Bike");
	}
	
	@Override
	public void start() {
		System.out.println("The Bike is starting");
	}
	
	@Override
	public void stop() {
		System.out.println("The Bike is stopping");
	}
}

class Car extends Vehicle{
	
	Car(String name){
		super(name,"Car");
	}
	
	@Override
	public void start() {
		System.out.println("The Car is starting");
	}
	
	@Override
	public void stop() {
		System.out.println("The Car is stopping");
	}
}
