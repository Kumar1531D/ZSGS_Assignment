package map;

import java.util.HashMap;

public class Remove {

	public static void main(String[] args) {
		
		HashMap<String, Integer> val = new HashMap<>();

		val.put("John", 85);
		val.put("Jane", 92);
		val.put("Tom", 76);
		val.put("Lucy", 89);

        if (val.containsKey("Tom")) {
        	val.remove("Tom");
        }

        System.out.println("Modified map : " + val);

	}

}
