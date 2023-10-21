package sorting;

import java.util.ArrayList;
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
    	for (int i = 0; i < n; i++) {
    		T key = arr[i];
    		int j = i + 1;
    		
    		while (j >= 0 && arr[j].compareTo(key) > 0) {
    			arr[j+1] = arr[j];
    			j--;
    		}
    		arr[j+1] = key;
    	}

    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
    	int n = arr.length;
    	
    	for(int i = 0; i < n - 1; i++) {
    		int min = i;
    		for(int j = i+1; j < n; j++) {
    			if(arr[j].compareTo(arr[min]) < 0) {
    				min = j;
    			}
    		}
    		T temp = arr[i];
    		arr[i] = arr[min];
    		arr[min] = temp;
    	}

    }


    public static <T extends Comparable<T>> void mergeSort(T[] arr) {

    }


    public static <T extends Comparable<T>> void quickSort(T[] arr) {

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