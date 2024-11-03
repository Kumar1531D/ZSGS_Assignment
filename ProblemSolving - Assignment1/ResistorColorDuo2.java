package artOfProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ResistorColorDuo2 {
	static List<String> bands = new ArrayList<>(Arrays.asList("black","brown","red","orange","yellow","green","blue","violet","gery","white"));
	
    public static int value(String[] colors) {
        return bands.indexOf(colors[0]) * 10 + bands.indexOf(colors[1]);
    }

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int size = in.nextInt();
		
		String[] colors = new String[size];
		
		for(int i=0;i<size;i++) {
			colors[i] = in.next();
		}
		
		System.out.println(value(colors));

	}

}
