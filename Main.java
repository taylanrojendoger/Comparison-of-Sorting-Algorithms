package algoPack;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void Redirection(String type, int size) throws IOException {

		InputOrders inputs = new InputOrders();
		int nums[];
		if (type.equals("RandomOrdered"))
			nums = inputs.randomInput(size);
		else if (type.equals("Ordered"))
			nums = inputs.orderedInput(size);
		else
			nums = inputs.reverseOrderedInput(size);
			int pos = nums.length/2; 
	
	/*	MergeSort merge = new MergeSort();
		System.out.println("Merge Sort => For input size = " + size + " and with input order type: " + type);
		merge.findExecutionTime(nums); */
		
		InsertionSort insert = new InsertionSort();
		System.out.println("Insertion Sort => For input size = " + size + " and with input order type: " + type);
		insert.findExecutionTime(nums); 
		
	/*	BinaryInsertionSort binarySearch = new BinaryInsertionSort();
		System.out.println("Binary Insertion Sort => For input size = " + size + " and with input order type: " + type);
		binarySearch.findExecutionTime(nums); 
	
		HeapSort heapsort = new HeapSort();
		System.out.println("Heap Sort => For input size = " + size + " and with input order type: " + type);
		heapsort.findExecutionTime(nums);  
		
		CountingSort countSort = new CountingSort();
		System.out.println("Counting Sort => For input size = " + size + " and with input order type: " + type);
		countSort.findExecutionTime(nums);  

		QuickSortFirstElementPivot quickFirst = new QuickSortFirstElementPivot();
		System.out.println("Quick Sort First Element Pivot => For input size = " + size + " and with input order type: " + type);
		quickFirst.findExecutionTime(nums, pos); 
		 
		QuickSortMedianOfThree quickMedian = new QuickSortMedianOfThree();
		System.out.println("Quick Sort Median Of Three => For input size = " + size + " and with input order type: " + type);
		quickMedian.findExecutionTime(nums); */
	
	}

	public static void main(String args[]) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter input size of the array: ");
		int n = input.nextInt();
		System.out.println("Choose order type (RandomOrdered/Ordered/ReverseOrdered): ");
		String choice = input.next();
		Redirection(choice, n);
	}

}
