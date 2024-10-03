package assignment2;

import java.util.Scanner;

public class MaxNumber {
	
	public static int findMax(int num1,int num2,int num3) {
		if(num1>=num2 && num1>=num3)
			return num1;
		if(num2>num1 && num2>num3)
			return num2;
		
		return num3;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter three Integer : ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		System.out.println("Greatest number is : "+findMax(num1,num2,num3));

	}

}
