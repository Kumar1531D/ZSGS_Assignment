package assignment_Interface;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String choice = "yes";
		
		while(choice.equalsIgnoreCase("yes")) {
		
			System.out.println("Enter the size of the Array : ");
			int n = in.nextInt();
			
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = in.nextInt();
			}
			
			in.nextLine();
			System.out.println("Select the sorting Algorithms (BubbleSort,QuickSort,MergeSort)");
			
			String ch = in.next();
			
			if(ch.equalsIgnoreCase("bubblesort")) {
				Sortable s = new BubbleSort();
				s.sort(arr);
				
				System.out.println("Bubble Sort : ");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+ " ");
				}
			}
			else if(ch.equalsIgnoreCase("mergesort")) {
				Sortable s = new MergeSort();
				s.sort(arr);
				
				System.out.println("Merge Sort : ");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+ " ");
				}
			}
			else if(ch.equalsIgnoreCase("quicksort")){
				Sortable s = new QuickSort();
				s.sort(arr);
				
				System.out.println("Quick Sort : ");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+ " ");
				}
			}
			else {
				System.out.println("Invalid choice");
				continue;
			}
			
			System.out.println();
			System.out.println("Do you want try another Sorting Algorithm?(yes/no)");
			choice = in.next();
		}

	}

}

interface Sortable{
	void sort(int nums[]);
}

class BubbleSort implements Sortable{

	@Override
	public void sort(int[] nums) {
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
	}
	
}

class selectionSort implements Sortable{

	@Override
	public void sort(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			int maxIndex = i;
			for(int j = i+1;j<nums.length;j++) {
				if(nums[j]<nums[maxIndex])
					maxIndex = j;
			}
			int temp = nums[maxIndex];
			nums[maxIndex] = nums[i];
			nums[i] = temp;
		}
	}
	
}

class MergeSort implements Sortable{

	@Override
	public void sort(int[] nums) {
		merge(nums,0,nums.length);
	}
	
	public void merge(int []nums,int start,int end) {
		if(end-start==1)
			return;
		
		int mid = (start+end)/2;
		
		merge(nums,start,mid);
		merge(nums,mid,end);
		
		mergePlace(nums,start,mid,end);
	}
	
	public void mergePlace(int nums[],int start,int mid,int end) {
		
		int ans[] = new int[end-start];
		
		int i = start;
		int j = mid;
		int k = 0;
		
		while(i<mid && j<end) {
			if(nums[i]<nums[j])
				ans[k++] = nums[i++];
			else
				ans[k++] = nums[j++];
		}
		
		while(i<mid)
			ans[k++] = nums[i++];
		
		while(j<end)
			ans[k++] = nums[j++];
		
		for(int y=0;y<ans.length;y++) {
			nums[start+y] = ans[y];
		}
	}
	
}

class QuickSort implements Sortable{

	@Override
	public void sort(int[] nums) {
		quickSort(nums,0,nums.length-1);
	}
	
	public static void quickSort(int arr[],int low,int high) {
		
		if(low>=high)
			return;
		
		int start = low;
		int end  = high;
		
		int mid = (start+end)/2;
		
		int pivot = arr[mid];
		
		while(start<=end) {
			while(arr[start]<pivot)
				start++;
			while(arr[end]>pivot)
				end--;
			
			if(start<=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
		quickSort(arr,low,end);
		quickSort(arr,start,high);
		
		
	}
}










