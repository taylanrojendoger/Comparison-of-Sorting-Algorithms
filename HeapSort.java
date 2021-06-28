package algoPack;

import java.util.Arrays;

public class HeapSort {
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] > arr[largest])
			largest = l;

		if (r < n && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void findExecutionTime(int arr[]) {
		int[] coppiedArray = copyArray(arr);
		long startTime = System.currentTimeMillis();
		System.out.println("\nUnsorted Array: " + Arrays.toString(coppiedArray));
		sort(coppiedArray);
		//System.out.println("\nSorted Array: " + Arrays.toString(coppiedArray));
		long endTime = System.currentTimeMillis();
		float timeElapse = (endTime - startTime) / 1000F;
		System.out.println("Execution time in Heap Sort in seconds: : " + timeElapse + " seconds\n");
	}

	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];
		return coppied;
	}
}
