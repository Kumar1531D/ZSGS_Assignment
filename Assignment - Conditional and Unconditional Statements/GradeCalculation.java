package assignment2;

import java.util.Scanner;

public class GradeCalculation {
	
	public static void findGrade(double score) {
		char grade;
		
		if(score>=90) {
			grade = 'O';
		}
		else if(score>=80) {
			grade = 'A';
		}
		else if(score>=70) {
			grade = 'B';
		}
		else if(score>=60) {
			grade = 'C';
		}
		else if(score>=50){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Your Grade is : "+grade);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean check = true;
		double score = 0;
		
		while(check) {
			System.out.println("Enter the Score : ");
			score = in.nextDouble();
			if(score>=0 && score <=100) {
				check = false;
			}
			else
				System.err.println("Invalid mark! please enter the score correctly");
		}
		
		findGrade(score);
		
		in.close();

	}

}
