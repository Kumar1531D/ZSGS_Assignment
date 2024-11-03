package university.courses;

import java.util.ArrayList;
import java.util.List;

import university.faculty.Faculty;
import university.students.Student;

public class Course {
	
	private String courseName;
	private String courseCode;
	private Faculty faculty;
	private List<Student> enrolledStudents;
	
	public Course(String courseName,String courseCode) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		enrolledStudents = new ArrayList<>();
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	
	public void addStudents(Student student) {
		enrolledStudents.add(student);
	}
	
	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public String getDetails() {
		StringBuilder ans = new StringBuilder();
		
		ans.append("\nCourse Details");
		ans.append("\nCourse Name : "+courseName);
		ans.append("\nCourse Code : "+courseCode);
		String n = faculty!=null ? faculty.getName() : "No faculty Assigned";
		ans.append("\nFaculty : " + n);
		ans.append("\nEnrolled Students : ");
		
		for(Student student : enrolledStudents) {
			ans.append("\n"+student.getName());
		}
		
		return ans.toString();
	}

}
