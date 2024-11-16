package stack;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "hello";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        System.out.println("Reversed String: " + reversedStr);

	}

}
