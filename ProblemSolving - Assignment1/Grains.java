package artOfProblemSolving;

import java.math.BigInteger;
import java.util.Scanner;

public class Grains {
	
    public static BigInteger grainsOnSquare(int square) {
        if (square <= 0 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1);
    }
    
    public static BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of Square");
		
		int square = in.nextInt();
		
		System.out.println(grainsOnSquare(square));
		
		System.out.println("Total number of grains in the board : "+grainsOnBoard());
		
	}

}
