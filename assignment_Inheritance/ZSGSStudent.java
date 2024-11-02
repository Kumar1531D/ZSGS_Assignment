package assignment_Inheritance;

public class ZSGSStudent extends Student{
	
	private int studentId;
	private String course;

	ZSGSStudent(String name, int age,int studentId,String course) {
		super(name, age);
		this.course = course;
		this.studentId = studentId;
	}
	
	ZSGSStudent(String name, int age,int studentId,String course,String address) {
		super(name, age,address);
		this.course = course;
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Id : "+studentId);
		System.out.println("Course : "+course);
	}

	public static void main(String[] args) {
		
		Student student1 = new ZSGSStudent("Kumar",22,536,"Java","ABC");
		student1.getDetails();
		
		ZSGSStudent student2 = new ZSGSStudent("Muthu", 23, 3904, "Java");
		student2.getDetails();

	}

}

class Student{
	
	private String name;
	private int age;
	private String address;
	
	Student(String name,int age){
		this.name = name;
		this.age = age;
		this.address = "unknown";
	}
	
	Student(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getDetails() {
		System.out.println("\nName : "+getName()+
				"\nAge : "+getAge()+
				"\nAddress : "+getAddress());
	}
}
