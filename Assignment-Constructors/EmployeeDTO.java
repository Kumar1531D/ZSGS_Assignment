package assignment_Constructors;

public class EmployeeDTO {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Kumar","1531D","Networking",1000000.00,25,"32023023958");
		System.out.println(emp.getDetails());
	}

}


class Employee{
	
	private String name;
	private String employeeId;
	private String department;
	private double salary;
	private int age;
	private String ssn;
	
	Employee(String name,String employeeId,String department,double salary,int age,String ssn){
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getLastFourDigitOfSSN() {
		return ssn.substring(ssn.length()-4,ssn.length());
	}
	
	public String getDetails() {
		return "\nName : "+name+
				"\nEmployeeId : "+employeeId+
				"\nDepartment : "+department+
				"\nSalary : "+salary+
				"\nAge : "+age+
				"\nssn : *******"+getLastFourDigitOfSSN();
	}
	
	
}
