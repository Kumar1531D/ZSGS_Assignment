package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ModifyElements {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("five");

        ListIterator<String> iterator = li.listIterator();
        
        while (iterator.hasNext()) {
            String current = iterator.next();
            if ("three".equals(current)) {
                iterator.set("THREE");
            }
        }

        System.out.println("Modified List: " + li);

	}

}
