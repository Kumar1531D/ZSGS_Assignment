package artOfProblemSolving;

import java.util.Map;
import java.util.Scanner;

public class KGGardern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String firstRow, secondRow;
		String[] childrenNames = { "Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana",
				"Joseph", "Kincaid", "Larry" };

		while (true) 
		{
			System.out.println("Enter the two rows of flower arrangement: ");
			firstRow = in.next();
			secondRow = in.next();
			if (firstRow.length() != 24 || secondRow.length() != 24) {
				System.out.println("Some flowers are missing!!!");
				continue;
			}
			break;
		}
		while (true) 
		{
			System.out.println("Whose flower do you need to know : ");
			String name = in.next();
			String flowers[] = findFlowers(childrenNames, name, firstRow, secondRow);
			System.out.println("The flowers of " + name + " are ");
			for (String i : flowers) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("Do you need to know any other's flowers? (Y,N): ");
			char choice = in.next().charAt(0);
			if (choice == 'N')
				break;
			System.out.println();
		}
		in.close();
	}

	public static String[] findFlowers(String[] childrenNames, String name, String firstRow, String secondRow) {
		Map<Character, String> flowerList = Map.of('G', "Grass", 'C', "Clover", 'R', "Radish", 'V', "Violet");
		String[] flowers = new String[4];
		for (int i = 0; i < childrenNames.length; i++) {
			if (childrenNames[i].equals(name)) {
				flowers[0] = flowerList.get(firstRow.charAt(i * 2));
				flowers[1] = flowerList.get(firstRow.charAt(i * 2 + 1));
				flowers[2] = flowerList.get(secondRow.charAt(i * 2));
				flowers[3] = flowerList.get(secondRow.charAt(i * 2 + 1));
			}
		}
		return flowers;
	}
}
