package assignment_Inheritance;

public class VechicleDemo {

	public static void main(String[] args) {
		
		Vehicle truck = new Truck("ASHOK","L50",2020,100,1.5);
		truck.displayDetails();
		
		System.out.println();
		
		Vehicle car = new Car("TATA","THAR",2023,120,"Offroad");
		car.displayDetails();
	}

}

class Vehicle{
	
	private String company;
	private String model;
	private int year;
	private double fuelCapacity;
	
	Vehicle(String company,String model,int year,double fuelCapacity){
		this.company = company;
		this.model = model;
		this.year = year;
		this.fuelCapacity = fuelCapacity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public void displayDetails() {
		System.out.println("Company : "+getCompany());
		System.out.println("Model : "+getModel());
		System.out.println("Year : "+getYear());
		System.out.println("Fuel Capacity : "+getFuelCapacity());
	}
	
}

class Truck extends Vehicle{
	
	private double payLoadCapacity; 

	Truck(String company, String model, int year,double fuelCapacity,double payLoadCapacity) {
		super(company, model, year,fuelCapacity);
		this.payLoadCapacity = payLoadCapacity;
	}

	public double getPayLoadCapacity() {
		return payLoadCapacity;
	}

	public void setPayLoadCapacity(int payLoadCapacity) {
		this.payLoadCapacity = payLoadCapacity;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("PayLoadCapacity : "+payLoadCapacity+" tons");
	}
	
}

class Car extends Vehicle{
	
	private String carType;

	Car(String company, String model, int year, double fuelCapacity,String carType) {
		super(company, model, year, fuelCapacity);
		this.carType = carType;
	}
	
	Car(String company, String model, int year, double fuelCapacity) {
		super(company, model, year, fuelCapacity);
		this.carType = "Sedan";
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Car Type : "+carType);
	}
	
}
