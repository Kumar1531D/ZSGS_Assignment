package assignment_MethodOverriding;

public class EmployeePloyMorphism {

	public static void main(String[] args) {
		
		Employee hourlyEmployee = new HourlyEmployee("Muthu",70);
		Employee salariedEmployee = new SalariedEmployee("Kumar",1000000);
		
		System.out.println(hourlyEmployee.getEmployeeDetails());
		System.out.println();
		System.out.println(salariedEmployee.getEmployeeDetails());

	}

}

class Employee{
	private String name;
	private int id;
	private static int idCounter = 0;
	
	Employee(String name){
		this.name = name;
		this.id = ++idCounter;
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
	
}

class HourlyEmployee extends Employee{
	private int hoursWorked;
	private int salary;

	HourlyEmployee(String name,int hoursWorked) {
		super(name);
		this.hoursWorked = hoursWorked;
		salary = hoursWorked*50;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String getEmployeeDetails() {
		return super.getEmployeeDetails()+ "\nHours Worked : "+hoursWorked+"\nSalary : "+salary;
	}
	
}

class SalariedEmployee extends Employee{
	private int salary;
	
	SalariedEmployee(String name,int salary){
		super(name);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String getEmployeeDetails() {
		return super.getEmployeeDetails()+"\nSalary : "+salary;
	}
}







