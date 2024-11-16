package arraylistandlinkedlist;

import java.util.ArrayList;

public class AddAndRetrieve {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Watermelon");
		fruits.add("Papaya");
		fruits.add("Banana");
		
		System.out.println("The third fruit is " + fruits.get(2));

	}

}
