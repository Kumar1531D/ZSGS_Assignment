package assignment2;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void printMultiplicationTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" X "+number+" = "+(i*number));
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to view it's multiplication table : ");
		
		int number = in.nextInt();
		
		printMultiplicationTable(number);
		
		in.close();

	}

}
