package assignment1;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int numberOfPeople = 10;
		double totalWeight = 0.0;
		
		for(int i=1;i<=numberOfPeople;i++) {
			System.out.println("Enter the weight of the person " + i);
			totalWeight+=in.nextDouble();
		}
		
		double averageWeight = totalWeight/numberOfPeople;
		
		System.out.println("The Average weight of 10 people is : "+averageWeight +"kg");

	}

}
