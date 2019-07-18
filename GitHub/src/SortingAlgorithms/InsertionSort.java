package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = input();
		InsertionSort(arr);

	}

	public static int[] input() {
		int n = scn.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {

			array[i] = scn.nextInt();
		}
		return array;
	}

	public static void InsertionSort(int[] arr) {
		int n = arr.length;
		int count = 1, j = 0;
		while (count <= n - 1) {

			int temp = arr[count];
			j = count - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
			count++;
		}
		for (int val : arr) {
			System.out.println(val);
		}

	}

}
