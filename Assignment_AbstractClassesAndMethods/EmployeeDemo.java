package assignment_AbstractClassesAndMethods;

import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Employee employee = null;
		
		while(true) {
			System.out.println("Enter 1 for Hourly Employee or Enter 2 for Salaried Employee");
			
			int choice = in.nextInt();
			in.nextLine();
			
			if(choice==1) {
				System.out.println("Enter the Name : ");
				String name = in.nextLine();
				System.out.println("Enter the Id : ");
				int id = in.nextInt();
				in.nextLine();
				System.out.println("Enter the hourly Pay : ");
				double hourlyPay = in.nextDouble();
				System.out.println("Enter the hours Worked : ");
				int hoursWorked = in.nextInt();
				
				employee = new HourlyEmployee(name,id,hoursWorked,hourlyPay); 
				break;
				
			}
			else if(choice==2) {
				System.out.println("Enter the Name : ");
				String name = in.nextLine();
				System.out.println("Enter the Id : ");
				int id = in.nextInt();
				in.nextLine();
				System.out.println("Enter the Annual Salary");
				double annualSalary = in.nextDouble();
				
				employee = new SalariedEmployee(name,id,annualSalary);
				break;
			}
			else
				System.out.println("Invalid choice!");
		}
		
		System.out.println(employee.getEmployeeDetails());
		System.out.println("Calculated Pay : "+employee.calculatePay());
	}
}

abstract class Employee{
	private String name;
	private int id;
	//private static int idCounter = 0;
	
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeDetails() {
		return "Name : "+name+"\nId : "+id;
	}
	
	abstract double calculatePay(); 
	
}

class HourlyEmployee extends Employee{
	private int hoursWorked;
	private double hourlyPay;

	HourlyEmployee(String name,int id,int hoursWorked,double hourlyPay) {
		super(name,id);
		this.hoursWorked = hoursWorked;
		this.hourlyPay = hourlyPay;
	}

	@Override
	double calculatePay() {
		return hoursWorked*hourlyPay;
	}
	
}

class SalariedEmployee extends Employee{
	private double annualSalary;
	
	SalariedEmployee(String name,int id,double salary){
		super(name,id);
		this.annualSalary = salary;
	}

	@Override
	double calculatePay() {
		return annualSalary/12;
	}
}
