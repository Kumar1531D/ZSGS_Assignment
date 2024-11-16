package linkedlist;

import java.util.LinkedList;

public class LinkedListOperation {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Original List: " + list);

        list.remove(2);

        list.removeLast();

        System.out.println("Modified List: " + list);

	}

}
