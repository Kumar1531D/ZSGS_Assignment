package university.faculty;

import java.util.ArrayList;
import java.util.List;

import university.courses.Course;

public class Faculty {
	private String name;
	private String facultyId;
	private List<Course> teachingCourses;
	
	public Faculty(String name,String facultyId){
		this.name = name;
		this.facultyId = facultyId;
		teachingCourses = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getFacultyId() {
		return facultyId;
	}
	
	public void addTeachingCourses(Course course) {
		teachingCourses.add(course);
		course.setFaculty(this);
	}
	
	public String getDetails() {
		StringBuilder ans = new StringBuilder();
		
		ans.append("\nFaculty Details");
		ans.append("\nName : "+name);
		ans.append("\nFaculty Id : "+facultyId);
		ans.append("\nTeaching Courses : ");
		
		for(Course c : teachingCourses) {
			ans.append("\n"+c.getCourseName());
		}
		
		return ans.toString();
	}
	
	
}
