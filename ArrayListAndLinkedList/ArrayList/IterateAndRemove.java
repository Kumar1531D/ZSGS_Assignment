package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateAndRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer> values = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		Iterator<Integer> iterator = values.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next()>30)
				iterator.remove();
		}
		
		System.out.println(values);

	}

}
