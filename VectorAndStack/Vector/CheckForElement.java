package vector;

import java.util.Vector;

public class CheckForElement {

	public static void main(String[] args) {
		
		Vector<Double> vector = new Vector<>();
        vector.add(15.31);
        vector.add(31.15);
        vector.add(2.10);
        vector.add(3.10);
        vector.add(15.0);

        boolean contains = vector.contains(10.5);
        
        System.out.println("Does the vector have 10.5? " + contains);
        System.out.println("Size of the vector before adding a new value: " + vector.size());

        vector.add(10.5);
        
        System.out.println("Size of the vector after adding a new value: " + vector.size());
        System.out.println("Vector Elements: " + vector);

	}

}
