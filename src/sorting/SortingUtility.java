package sorting;

import java.util.ArrayList;
import java.util.Arrays;

import shapes.shapes;

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
		for (int i = 1; i < n; i++) {
			T key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) < 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}

	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int max = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[max]) > 0) {
					max = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
	}

	public static <T extends shapes> void mergeSort(T[] arr) {
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

	//For heapsort
    public static <T extends Comparable<T>> void customSort(T[] arr) {
    	//length of array
    	int lenght = arr.length;
    	
    	for(int i = lenght/2 -1; i>= 0; i--) {
    		heapify(arr, lenght, i);
    	}
    	for(int i = lenght/2 - 1; i>= 0; i--) {
    		T swap = arr[0];
    		arr[0] = arr[i];
    		arr[i] = swap;
    		
    		heapify(arr, i, 0);
    	}

    }
    //For heapsort
    public static <T extends Comparable<T>> void heapify(T[] arr, int lenght, int i) {
    	int largest = i;
    	int left = 2 * i + 1;
    	int right = 2* i + 2;
    	if(left < lenght && ((arr[left]).compareTo(arr[largest]) >0)) {
    		largest = left;  
    	}
    	if(left < lenght && (arr[right].compareTo(arr[largest]) >0)) {
       		largest = right;
    	}
    	if(largest != 1) {
    		T swap = arr[i];
    		arr[i] = arr[largest];
    		arr[largest] = swap;
    		
    		heapify(arr, lenght, largest);
    	}
    	
    }
}
