package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = input();
		bubbleSort(arr);

	}

	public static int[] input() {
		int n = scn.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {

			array[i] = scn.nextInt();
		}
		return array;
	}

	public static void display(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}

	public static void bubbleSort(int[] arr) {
		int count = 0;
		for (count = 0; count < arr.length - 1; count++) {
			for (int i = 0; i < arr.length - count - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int j = 0; j <= arr.length - 1; j++) {
			System.out.println(arr[j]);
		}
	}
}
