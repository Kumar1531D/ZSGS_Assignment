package arraylistandlinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search {
	
	public static int search(List<Character> values,char c) {
		int index = -1;
		
		for(int i=0;i<values.size();i++) {
			if(values.get(i)==c) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		
		ArrayList<Character> values = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j'));
	
		ArrayList<Integer> v = new ArrayList<>();
		
		v.add(2);
		v.add(2);
		
		System.out.println(v.get(0)==v.get(1));
		
		char c = 'd';
		
		int index = search(values,c);
		
		if(index!=-1)
			System.out.println("Index of "+ c +" "+index);
		else
			System.out.println(c+" is not present in values");

	}

}
