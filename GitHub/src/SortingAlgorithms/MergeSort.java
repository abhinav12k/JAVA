package SortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 100, 0, 10, 30, 2, 9 };
//		quickSort(arr, 0, arr.length - 1);
//		for (int val : arr) {
//			System.out.println(val);
//		}

		int[] sortedArray = mergeSort(arr, 0, arr.length - 1);
		for (int val : sortedArray) {
			System.out.println(val);
		}

	}

	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

		int[] mergedArray = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
				k++;
			} else {
				mergedArray[k] = arr2[j];
				j++;
				k++;
			}
		}

		if (i == arr1.length) {
			while (j < arr2.length) {
				mergedArray[k] = arr2[j];
				j++;
				k++;
			}
		}

		if (j == arr2.length) {
			while (i < arr1.length) {
				mergedArray[k] = arr1[i];
				i++;
				k++;
			}
		}

		return mergedArray;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] result = mergeTwoSortedArrays(fh, sh);
		return result;
	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int left = lo;
		int right = hi;
		int pivot = arr[(lo + hi) / 2];

		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
				left++;
			}
		}

		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}

}
