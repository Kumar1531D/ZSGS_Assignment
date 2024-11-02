package assignment_ExceptionHandling;

import java.util.Scanner;

public class DivideByZeroException {
	
	public static int divide(int dividend,int devisor) {
		return dividend/devisor;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("Enter the Dividend");
			int dividend = in.nextInt();
			System.out.println("Enter the Divisor");
			int divisor = in.nextInt();
			in.nextLine();
			System.out.println(dividend+"/"+divisor+" = " +divide(dividend,divisor));
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by zero is not allowed");
		}

	}

}
