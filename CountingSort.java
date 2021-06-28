package algoPack;

import java.util.Arrays;

public class CountingSort {
	static void countSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1;
		int count[] = new int[range];
		int output[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	void findExecutionTime(int arr[]) {
		int[] coppiedArray = copyArray(arr);
		long startTime = System.currentTimeMillis();
	//	System.out.println("\nUnsorted Array: " + Arrays.toString(coppiedArray));
		countSort(coppiedArray);
	//	System.out.println("\nSorted Array: " + Arrays.toString(coppiedArray));
		long endTime = System.currentTimeMillis();
		float timeElapse = (endTime - startTime) / 1000F;
		System.out.println("Execution time in Counting Sort in seconds: : " + timeElapse + " seconds\n");
	}
	
	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];

		return coppied;
	}

}
