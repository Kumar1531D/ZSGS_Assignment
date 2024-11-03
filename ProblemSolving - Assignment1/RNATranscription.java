package artOfProblemSolving;

import java.util.Scanner;

public class RNATranscription {
	
	public static String convert(String dna) {
		StringBuilder ans = new StringBuilder();
		
		for(char c : dna.toCharArray()) {
			switch(c) {
			case 'G':
				ans.append('C');
				break;
			case 'C':
				ans.append('G');
				break;
			case 'T':
				ans.append('A');
				break;
			case 'A':
				ans.append('U');
				break;
			}
		}
		
		return ans.toString();
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the DNA format contains only letters('G','C','T','A') : ");
		String dna = in.next();
		
		System.out.println(convert(dna));
	}

}
