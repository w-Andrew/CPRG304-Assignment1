package sorting;

import java.util.Arrays;

public class SortingUtility {

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
	}

	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			T key = arr[i];
			int j = i + 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}

	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public <T extends Comparable<T>> void mergeSort(T[] arr) {
		System.out.println("we are inside deconstructing :O " + arr.length);
		if (arr.length > 1) {
			int mid = arr.length / 2;

			T[] lower = Arrays.copyOfRange(arr, 0, mid);
			T[] higher = Arrays.copyOfRange(arr, mid, arr.length);

			mergeSort(lower);
			mergeSort(higher);

			merge(arr, lower, higher);

		}
	}

	public static <T extends Comparable<T>> void merge(T[] arr, T[] lower, T[] higher) {
		// System.out.println("Merging: " + (lower.length + higher.length));
		int i = 0;
		int j = 0;
		int k = 0;
		do {
			if (lower[i].compareTo(higher[j]) < 0) {
				arr[k] = higher[j];
				j++;
			} else {
				arr[k] = lower[i];
				i++;
			}
			k++;

		} while (i < lower.length && j < higher.length);
	}

	public static <T extends Comparable<T>> void quickSort(T[] arr) {

	}

	public static <T extends Comparable<T>> void customSort(T[] arr) {

	}

}
