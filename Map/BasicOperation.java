package map;

import java.util.HashMap;

public class BasicOperation {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("Diana", 28);
        map.put("Edward", 40);

        int age = map.get("Charlie");
        System.out.println("Charlie's age is : " + age);

        System.out.println("All names and ages in the map:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

	}

}
