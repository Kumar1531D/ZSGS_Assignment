package artOfProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ResistorColor {
	
	public static int findNumber(String color,List<String> bands) {
		
		for(int i=0;i<bands.size();i++) {
			if(bands.get(i).equalsIgnoreCase(color)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public static void displayColors(List<String> bands) {
		for(String color : bands) {
			System.out.println(color);
		}
	}

	public static void main(String[] args) {
		
		List<String> bands = new ArrayList<>(Arrays.asList("black","brown","red","orange","yellow","green","blue","violet","gery","white"));

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Color");
		String color = in.next();
		
		System.out.println("The Number of the color is "+findNumber(color, bands));
		
		System.out.println("All the colors are : ");
		displayColors(bands);
		
	}

}
