package assignment_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			String phoneNumber = in.next();
			if(!isNum(phoneNumber))
				throw new InputMismatchException("Input is not valid");
			
			System.out.println("Phone Number is Valid");
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static boolean isNum(String number) {
		return number!=null && number.matches("[0-9]+");
	}

}
