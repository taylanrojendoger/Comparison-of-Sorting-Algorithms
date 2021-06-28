package algoPack;
public class QuickSortFirstElementPivot {
	public int partition(int[] a, int left, int right) {
		int pivot = a[left];
		while (left <= right) {
			while (a[left] < pivot)
				left++;
			while (a[right] > pivot)
				right--;
			if (left <= right) {
				int tmp = a[left];
				a[left] = a[right];
				a[right] = tmp;
				left++;
				right--;
			}
		}
		return left;
	}

	public void recursiveQuickSort(int[] a, int i, int j) {
		int idx = partition(a, i, j);
		if (i < idx - 1) {
			recursiveQuickSort(a, i, idx - 1);
		}
		if (j > idx) {
			recursiveQuickSort(a, idx, j);
		}
	}

	void findExecutionTime(int arr[], int k) {
		int[] coppied = copyArray(arr);
		long startTime = System.currentTimeMillis();
		// System.out.println("\nSorted Array: " + Arrays.toString(coppied));
		recursiveQuickSort(coppied, 0, coppied.length - 1);
		long endTime = System.currentTimeMillis();
		float timeElapse = (endTime - startTime) / 1000F;
		System.out.println("Execution time in Quick Sort(FirstElementPivot) in seconds: : " + timeElapse + " seconds\n");
		// System.out.println("\nSorted Array: " + Arrays.toString(coppied));
	}

	public static int[] copyArray(int[] arr) {
		int[] coppied = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			coppied[i] = arr[i];
		return coppied;
	}
}
