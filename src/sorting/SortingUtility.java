package sorting;
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


    public static <T extends Comparable<T>> void customSort(T[] arr) {

    }
}
