package map;

import java.util.HashMap;

public class CountFrequencyOfElements {

	public static void main(String[] args) {
		
		String input = "programming";
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : input.toCharArray()) {
        	frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (Character key : frequency.keySet()) {
            System.out.println(key + ": " + frequency.get(key));
        }

	}

}
