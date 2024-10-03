package assignment2;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	public static int sumOfEven(int a[],int size) {
		int ans = 0;
		for(int i=0;i<size;i++) {
			if(a[i]%2==1)
				continue;
			ans+=a[i];
		}
		
		return ans;
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
		
		int ans = sumOfEven(a,size);
		
		System.out.println("Sum of even numbers in the given Array is : "+ans);
		
		in.close();

	}

}
