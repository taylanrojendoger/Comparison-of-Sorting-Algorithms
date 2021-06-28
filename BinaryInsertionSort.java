package algoPack;

import java.util.Arrays;

public class BinaryInsertionSort {
	
	public void sort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int x = array[i];
			int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
			System.arraycopy(array, j, array, j + 1, i - j);
			array[j] = x;
		}
	}
	
	void findExecutionTime(int arr[]) {
		int[] coppiedArray = copyArray(arr);
		long startTime = System.currentTimeMillis();
	//	System.out.println("\nUnsorted Array: " + Arrays.toString(coppiedArray));
		sort(coppiedArray);
	//	System.out.println("\nSorted Array: " + Arrays.toString(coppiedArray));
		long endTime = System.currentTimeMillis();
		float timeElapse =  (endTime - startTime) / 1000F;
		System.out.println("Execution time in Binary-Insertion Sort in seconds: : " + timeElapse + " seconds\n");
	}
	
	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];

		return coppied;
	}
}
