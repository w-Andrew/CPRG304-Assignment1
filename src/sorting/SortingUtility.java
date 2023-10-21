package sorting;

import java.util.Arrays;

import shapes.shapes;

public class SortingUtility {

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int n = arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) < 0) {
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
				if (arr[j].compareTo(arr[min]) > 0) {
					min = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public <T extends shapes> void mergeSort(T[] arr) {
		if (arr.length > 1) {
			int mid = arr.length / 2;

			T[] lower = Arrays.copyOfRange(arr, 0, mid);
			T[] higher = Arrays.copyOfRange(arr, mid, arr.length);

			mergeSort(lower);
			mergeSort(higher);

			merge(arr, lower, higher);

		}
	}

	public static <T extends shapes> void merge(T[] arr, T[] lower, T[] higher) {
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

		while (i < lower.length) {
			arr[k] = lower[i];
			i++;
			k++;
		}
		while (j < higher.length) {
			arr[k] = higher[j];
			j++;
			k++;
		}
	}

	public static <T extends shapes> void quickSort(T[] arr, int low, int high) {
		// if this is met we can no longer split the array
		if (high <= low) {
			return;
		}

		// sort array with and return the used pivot index
		int pivot = partition(arr, low, high);

		// call quicksort again while not sorting our pivot which is in the correct
		// location
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);

	}

	public static <T extends shapes> int partition(T[] arr, int low, int high) {
		// grab last index as pivot
		T pivot = arr[high];
		int i = low - 1;

		// sort vs pivot
		for (int j = low; j <= high; j++) {
			if (arr[j].compareTo(pivot) > 0) {
				i++;
				// swap
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;

		// put pivot in it's correct spot
		T temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		// return index of pivot
		return i;
	}

	public static <T extends Comparable<T>> void customSort(T[] arr) {

	}

}
