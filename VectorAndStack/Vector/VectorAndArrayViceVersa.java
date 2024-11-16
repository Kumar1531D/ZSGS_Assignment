package vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorAndArrayViceVersa {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
        vector.add("red");
        vector.add("green");
        vector.add("blue");
        vector.add("yellow");

        String[] arr = vector.toArray(new String[0]);
        System.out.println("Vector to Array: " + Arrays.toString(arr));

        Vector<String> arrayVector = new Vector<>(Arrays.asList(arr));
        System.out.println("Array to Vector: " + arrayVector);

	}

}
