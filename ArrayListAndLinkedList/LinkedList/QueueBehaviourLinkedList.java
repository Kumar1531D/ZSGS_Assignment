package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBehaviourLinkedList {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.add("Alice");
		queue.add("Bob");
		queue.add("Charlie");
		queue.add("Diana");

		System.out.println("Initial Queue: " + queue);

		queue.poll(); 
		queue.poll(); 

		System.out.println("Queue after removing first two elements: " + queue);

	}

}
