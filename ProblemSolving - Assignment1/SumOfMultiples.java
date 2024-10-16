package problemSolvingAssignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfMultiples {
	
	public static int calculatePoints(int playerLevel,int baseValues[]) {
		
		Set<Integer> values = new HashSet<>();
		int sum = 0;
		
		for(int value : baseValues) {
			for(int i=value;i<playerLevel;i+=value) {
				values.add(i);
			}
		}
		
		
		for(int val : values) {
			sum+=val;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Player Level");
		
		int playerLevel = in.nextInt();
		
		System.out.println("Enter the baseValues count");
		
		int n = in.nextInt();
		
		int baseValues[] = new int[n];
		
		System.out.println("Enter the "+n+" base values : ");
		for(int i=0;i<n;i++) {
			baseValues[i] = in.nextInt();
		}
		
		int points = calculatePoints(playerLevel, baseValues);
		
		System.out.println("The Energy points rewarded to the player is "+points);
		
		in.close();

	}

}
