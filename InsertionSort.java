package algoPack;

import java.util.Arrays;

public class InsertionSort {

	int sort(int arr[]) {
		int counter = 0;
		int[] array = arr;
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
			counter++;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
				counter++;
			}
			array[j + 1] = key;
		}
		return counter;
	}

	void findExecutionTime(int arr[]) {
		int[] coppiedArray = copyArray(arr);
		long startTime = System.currentTimeMillis();
//		System.out.println("\nUnsorted Array: " + Arrays.toString(coppiedArray));
		sort(coppiedArray);
//		System.out.println("\nSorted Array: " + Arrays.toString(coppiedArray));
		long endTime = System.currentTimeMillis();
		float timeElapse =  (endTime - startTime) / 1000F;
		System.out.println("Execution time in Insertion Sort in seconds: : " + timeElapse + " seconds\n");
	}

	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];

		return coppied;
	}

}
