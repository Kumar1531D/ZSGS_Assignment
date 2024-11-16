package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		List<String> values = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		
		String arrayValues[] = values.toArray(new String[0]);
		
		System.out.println("ArrayList to Array : ");
		for(int i=0;i<arrayValues.length;i++) {
			System.out.print(arrayValues[i]+" ");
		}
		
		System.out.println();
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrayValues));
		
		System.out.println("Array to ArrayList : ");
		
		System.out.println(arrayList);
		

	}

}
