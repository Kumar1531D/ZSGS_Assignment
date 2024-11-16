package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SortedList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Integer> values = new ArrayList<>();
		
		Random random = new Random();
		
		System.out.println("Enter the size of the ArrayList : ");
		int size = in.nextInt();
		
		for(int i=0;i<size;i++) {
			values.add(random.nextInt(100)+1);
		}
		
		Collections.sort(values);
		
		System.out.println(values);

	}

}
