package problemSolvingAssignment;

import java.util.Scanner;

public class Acronym {
	
	public static void convertAcronym(String str) {
		StringBuilder ans = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			if(i==0 || str.charAt(i-1)==' ' || str.charAt(i-1)=='-')
				if(str.charAt(i)>='a' && str.charAt(i)<='z')
					ans.append((char)(str.charAt(i)-32));
				else
					ans.append(str.charAt(i));
		}
		
		System.out.println(ans);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a Phrase");
		
		String s = in.nextLine();
		
		convertAcronym(s);
		
		in.close();

	}

}
