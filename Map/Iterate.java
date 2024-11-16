package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Iterate {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> val = new TreeMap<>();

		val.put("banana", 2);
		val.put("apple", 5);
		val.put("cherry", 7);
		val.put("date", 3);

        Iterator<Map.Entry<String, Integer>> iterator = val.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
