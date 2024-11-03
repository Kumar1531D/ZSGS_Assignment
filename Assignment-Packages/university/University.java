package university;

import university.courses.Course;
import university.faculty.Faculty;
import university.students.Student;

public class University {

	public static void main(String[] args) {
		
		Student student1= new Student("Muthu","SD12");
		Student student2 = new Student("Ram","SD13");
		
		Faculty faculty = new Faculty("Kumar","FY15");
		
		Course course = new Course("JAVA","C1");
		
		faculty.addTeachingCourses(course);
		
		student1.enrollCourse(course);
		student2.enrollCourse(course);
		
		System.out.println(course.getDetails());
		
		System.out.println(faculty.getDetails());
		
		System.out.println(student1.getDetails());
		System.out.println(student2.getDetails());

	}

}
