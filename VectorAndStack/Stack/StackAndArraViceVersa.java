package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackAndArraViceVersa {

	public static void main(String[] args) {
		
		Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);

        Double[] arr = stack.toArray(new Double[0]);
        System.out.println("Stack to Array: " + Arrays.toString(arr));

        Stack<Double> newStack = new Stack<>();
        newStack.addAll(Arrays.asList(arr));
        System.out.println("Array to Stack: " + newStack);

	}

}
