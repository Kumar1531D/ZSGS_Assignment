package assignment1;

import java.util.Scanner;

public class GetWeekdayName {
	
	public enum Weekday{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 to 7 : ");
		int num = in.nextInt();
		
		if(num<0 || num>7)
			System.out.println("Enter a valid input! Enter the number between 1 to 7 ");
		else {
			int index = num-1;
			Weekday day = Weekday.values()[index];
			System.out.println("Day of the week is "+day);
		}
			
	}

}
