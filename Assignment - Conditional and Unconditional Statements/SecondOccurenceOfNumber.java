package assignment2;

import java.util.Scanner;

public class SecondOccurenceOfNumber {
	
	public static void findOccurence(int a[],int num) {
		boolean firstOccurence = false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				if(firstOccurence) {
					System.out.println("The given number occur second time at index : "+i);
					return;
				}
				firstOccurence = true;
			}
		}
		
		if(firstOccurence)
			System.out.println("The given number is appeared only one time");
		else
			System.out.println("The given number is not present in the array");
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of an array : ");
		int size = in.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the array elements : ");
		
		for(int i=0;i<size;i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Enter the number to be found : ");
		int num = in.nextInt();
		
		findOccurence(a, num);
		
		in.close();

	}

}
