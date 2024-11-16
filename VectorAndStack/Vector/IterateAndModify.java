package vector;

import java.util.Enumeration;
import java.util.Vector;

public class IterateAndModify {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        vector.add("date");
        vector.add("fig");

        System.out.println("Original elements:");
        Enumeration<String> elements = vector.elements();
        
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }

        int index = vector.indexOf("cherry");
        
        if (index != -1) {
            vector.set(index, "coconut");
        }

        System.out.println("\nModified Vector: " + vector);

	}

}
