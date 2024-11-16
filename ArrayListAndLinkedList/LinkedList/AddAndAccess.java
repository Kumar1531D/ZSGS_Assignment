package linkedlist;

import java.util.LinkedList;

public class AddAndAccess {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		
		System.out.println("First Element : "+li.getFirst());
		System.out.println("Last Element : "+li.getLast());

	}

}
