package vector;

import java.util.Vector;

public class BasicOperation {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        int elementAtSecondIndex = vector.get(2);
        System.out.println("Element at index 2 (third element): " + elementAtSecondIndex);

        System.out.println("All elements in the Vector: " + vector);

	}

}
