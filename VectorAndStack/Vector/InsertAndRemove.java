package vector;

import java.util.Vector;

public class InsertAndRemove {

	public static void main(String[] args) {
		
		Vector<Character> vector = new Vector<>();

        vector.add('A');
        vector.add('B');
        vector.add('C');
        vector.add('D');
        vector.add('E');

        System.out.println("Without Modify : " + vector);

        vector.add(2, 'X');

        vector.remove(0);

        System.out.println("After Modify : " + vector);

	}

}
