package exercism2;

import java.util.*;

public class KillerSudokuHelper 
{
    public static void main(String[] args) 
    {
    	Scanner in=new Scanner(System.in);
    	System.out.print("Enter the cage Size: ");
    	int cageSize = in.nextInt();
    	
        System.out.print("Enter the cage Sum: ");
        int cageSum = in.nextInt();
        
        System.out.println("Enter the number of elements that are already present: ");
        int conSize=sc.nextInt();
        
        Set<Integer> constraints = new HashSet<>();
        
        while(conSize-- > 0)
        	constraints.add(in.nextInt());

        List<List<Integer>> validComb = new ArrayList<>();
        findValidCombinations(cageSum, cageSize, constraints, validComb, new ArrayList<Integer>(),1,0);
        
        displayOutput(cageSum,cageSize,validComb);
        
    }
    public static void findValidCombinations(int cageSum, int cageSize, Set<Integer> constraints,List<List<Integer>> validCombinations, List<Integer> currCombo,int start,int currSum)
    {
    	if(currCombo.size()==cageSize)
    	{
    		if(cageSum==currSum)
    			validCombinations.add(new ArrayList<>(currCombo));
    		return;
    	}
    	for(int i=start;i<=9;i++)
    	{
    		int size=constraints.size();
    		constraints.add(i);
    		if(size!=constraints.size())
    		{
    		    currCombo.add(i);
    		    findValidCombinations(cageSum,cageSize,constraints,validCombinations,currCombo,i+1,currSum+i); 
    		    currCombo.remove(currCombo.size()-1);
    		    constraints.remove(i);
    		}
    	}
    }
    
    public static void displayOutput(int cageSum, int cageSize,List<List<Integer>> validCombinations)
    {
    	System.out.println("Valid combinations for sum " + cageSum + " with " + cageSize + " cells:");
    	for(List<Integer> temp: validCombinations)
        {
        	for(int element:temp)
        		System.out.print(element);
            System.out.println();
        }
    }
}
