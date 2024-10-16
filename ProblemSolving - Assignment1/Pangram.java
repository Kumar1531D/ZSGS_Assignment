package problemSolvingAssignment;

import java.util.Scanner;

public class Pangram {
	
	public static boolean isPangram(String str) {
		
		int check[] = new int[26];
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				check[str.charAt(i)-'a']++;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				check[str.charAt(i)-'A']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(check[i]==0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String str = in.nextLine();
		
		if(isPangram(str)) {
			System.out.println("It is a pangram");
		}
		else
			System.out.println("It is not a pangram");

	}

}
