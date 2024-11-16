package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean check(String str) {
		
		Stack<Character> val = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(')
				val.push('(');
			else {
				if(val.isEmpty())
					return false;
				
				val.pop();
			}
		}
		
		if(val.isEmpty())
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Paranthesis ");
		
		String str = in.next();
		
		if(check(str)) {
			System.out.println("The Paranthesis in the String are balanced");
		}
		else {
			System.out.println("The Paranthesis in the String are not balanced");
		}

	}

}
