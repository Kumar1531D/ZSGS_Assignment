package hashing;

import java.util.HashMap;

public class BasicOperation {

	public static void main(String[] args) {
		
		HashMap<String, String> grades = new HashMap<>();

		grades.put("Kumar", "O");
		grades.put("Antony", "A");
		grades.put("Thiru", "B");
		grades.put("Prathosh", "C"); 
		grades.put("Suresh", "F");
		grades.put("Prathosh", "F");

        System.out.println("Grades: " + grades);

        String grade = grades.get("Prathosh");
        System.out.println("Grade for Prathosh: " + grade);


	}

}
