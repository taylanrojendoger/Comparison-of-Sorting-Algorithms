package algoPack;

import java.util.Arrays;
import java.util.Date;

public class MergeSort {

	static void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}

		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {

				arr[k] = L[i];
				i++;
			} else {

				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static int mergeSort(int arr[], int l, int r) {

		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}

		return arr[arr.length / 2];
	}

	void findExecutionTime(int arr[]) {
		int[] coppiedArray = copyArray(arr);
		long startTime = System.currentTimeMillis();
		//System.out.println("\nUnsorted Array: " + Arrays.toString(coppiedArray));
		mergeSort(coppiedArray, 0, coppiedArray.length - 1);
		//System.out.println("\nSorted Array: " + Arrays.toString(coppiedArray));
		long endTime = System.currentTimeMillis();
		float timeElapse =  (endTime - startTime) / 1000F;
		System.out.println("Execution time in Merge Sort in seconds: : " + timeElapse + " seconds\n");
	}

	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];

		return coppied;
	}
	
}
