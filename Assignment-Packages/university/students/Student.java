package university.students;

import java.util.ArrayList;
import java.util.List;

import university.courses.Course;

public class Student {
	String name;
	String studentId;
	List<Course> enrolledCourses;
	
	public Student(String name,String studentId){
		this.name = name;
		this.studentId = studentId;
		enrolledCourses = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public void enrollCourse(Course course) {
		enrolledCourses.add(course);
		course.addStudents(this);
	}
	
	public List<Course> getEnrolledCourses(){
		return enrolledCourses;
	}
	
	public String getDetails() {
		StringBuilder ans = new StringBuilder();
		
		ans.append("\nName : "+name);
		ans.append("\nStudentId : "+studentId);
		ans.append("\nCourses Enrolled : ");
		for(Course c : enrolledCourses) {
			ans.append("\n"+c.getCourseName());
		}
		
		return ans.toString();
	}
}
