package algoPack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSortMedianOfThree {
	
	void findExecutionTime(int arr[]) {
		int coppied[] = copyArray(arr);
		int n = coppied.length - 1;
		long startTime = System.currentTimeMillis();
		//System.out.println("\nSorted Array: " + Arrays.toString(coppied));
		medianQuickSort(coppied, 0, n);
		//System.out.println("\nSorted Array: " + Arrays.toString(coppied));
		long endTime = System.currentTimeMillis();
		float timeElapse = (endTime - startTime) / 1000F;
		System.out.println("Execution time in Quick Sort(FirstElementPivot) in seconds: : " + timeElapse + " seconds\n");

	}

	public static int medianPivot(int arr[], int low, int high) {

		int first = arr[low];
		int last = arr[arr.length - 1];
		int mid = (high) / 2;
		int[] sortingArr = { arr[low], arr[mid], arr[high] };
		Arrays.sort(sortingArr);
		int middleValue = sortingArr[1];
		int temp = arr[high];
		arr[high] = middleValue;
		if (middleValue == arr[low]) {
			arr[low] = temp;
		} else if (middleValue == arr[mid]) {
			arr[mid] = temp;
		}

		return partition(arr, low, high);

	}

	public static void medianQuickSort(int arr[], int low, int high) {
		if (low >= high)
			return;

		if (low < high) {

			int pi = medianPivot(arr, low, high);

			QuickSort(arr, low, high);

		}
	}

	public static void QuickSort(int arr[], int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);
			QuickSort(arr, low, pi - 1);
			QuickSort(arr, pi + 1, high);
		}
	}

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;

	}

	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];
		return coppied;
	}
}
