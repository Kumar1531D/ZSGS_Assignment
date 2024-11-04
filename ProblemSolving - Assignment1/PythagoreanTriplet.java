package exercism2;
import java.util.*;

public class PythagoreanTriplet 
{
    public static void main(String[] args) 
    {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int n=in.nextInt();
		List<List<Integer>> triplets=getTriplets(n);
		if(triplets.size()>0)
		{
			System.out.println("The Pythagorean triplets are");
			System.out.println(triplets);
		}
		else
			System.out.println("There are no Pythagorean triplets");
	    in.close();
	}
    public static List<List<Integer>> getTriplets(int n)
    {
    	List<List<Integer>> triplets=new ArrayList<>();
        for (int a = 1; a < n / 3; a++) 
        {
            for (int b = a + 1; b < n / 2; b++) 
            {
                int c = n - a - b;
                if (a*a + b*b == c*c) 
                {
                	triplets.add(new ArrayList<Integer>(Arrays.asList(a,b,c)));
                }
            }
        }
        return triplets;
    }
}

/*
OUTPUT

Enter the integer N: 
50
There are no Pythagorean triplets

Enter the integer N: 
120
There Pythagorean triplets are
[[20, 48, 52], [24, 45, 51], [30, 40, 50]]

*/
