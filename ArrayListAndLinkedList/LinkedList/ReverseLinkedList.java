package linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static LinkedList<Character> reverse(LinkedList<Character> li) {
		
		int size = li.size();
		
		for(int i=size-2;i>=0;i--) {
			char temp = li.remove(i);
			li.addLast(temp);
		}
		
		return li;
	}

	public static void main(String[] args) {
		
		LinkedList<Character> li = new LinkedList<>();
		li.add('A');
		li.add('B');
		li.add('C');
		li.add('D');
		li.add('E');
		
		System.out.println("LinkedList Values : "+li);
		
		LinkedList<Character> reversedLinkedList =	reverse(li);
		
		System.out.println("Reversed LinkedList : "+reversedLinkedList);
		

	}

}
