package util;

import java.io.File;

import shapes.shapes;
import sorting.Sort;
import sorting.SortingUtility;

public class CommandLine {
	//String input = System.console().readLine();
	public static void main(String[] args) {
		String filePath = null;//so it does not cause undefined error or something
		String sortby = null;//What to sort by, a, h, b
		String method = null;//What sorting method to use
		if(args.length != 3) {
			System.out.println("This program need 3 inputs, example 'java -jar sort.jar -ffile_name -tv -sb'");
			System.out.print("You used ");
			System.out.println(args.length);
		}
		for(String arg : args) {
			char ch = arg.charAt(0);
			char ch2 = arg.charAt(1);
			if(ch != '-') {
				System.out.println("This program the selectors to begin with -f -t and -s, one of your inputs was not one of them.");
			}
			else if(ch2 != 's' || ch2 != 't' || ch2 != 'f' ) {
				System.out.println("You have the - but not the 's', 'f' ot 't'");
			}
			if(ch == '-' && (ch2 == 'f' || ch2 == 'F')) {
				if(filePath != null) {
					System.out.println("You already given the file or path  atleast twice, program will attempt to use the secound one");
				}
				filePath = arg.substring(2);
			}else if(ch == '-' && (ch2 == 's' || ch2 == 'S')) {
				if(method != null) {
					System.out.println("You already given the methid atleast twice, program will attempt to use the secound one");
				}
				method = arg.substring(2);
				if(method != "b" || method != "s" || method != "i" || method != "m" || method != "q" || method != "z") {
					System.out.println("For most recent method, you have entered an incorrect value");
				}
			}else if(ch == '-' && (ch2 == 't' || ch2 == 'T')) {
				if(method != null) {
					System.out.println("You already given the methid atleast twice, program will attempt to use the secound one");
				}
				method = arg.substring(2);
				if(method != "b" || method != "h" || method != "a") {
					System.out.println("For most recent value to sort by, you have entered an incorrect value");
				}
			}
		}
		
		//Null undefined error
		if(filePath == null) {
			System.out.println("You need to use -f and then file name or path inorder to use this program.");
		}
		if(method == null) {
			System.out.println("You did not entered a sorting algorthim to sort by, please use -s and immediately follow by 'b','s','i','m','q' or 'z' ex'-sz'");
		}
		if(sortby == null) {
			System.out.println("You have not enter a value to sort by, use -t and immediately follow by 'b' 'h' or 'a' ex '-th'");
		}
		
		//Print path or file
		System.out.println(filePath);
		
		
		shapes[] theShapes;
		//Initialize the array of object here
		try {
			theShapes = Sort.getShapes(filePath);
		}
		catch(Exception e){
			System.out.println("Error, something seems to be wrong with the file you provide, please try another one");
		}
		
		theShapes = Sort.getShapes(filePath);
		
		//time how long it takes to sort
		long startTime = System.nanoTime();
		//based on selected method use if else to take, also time it
		if(method == "b") {
			if(sortby == "b") {
				for(shapes i:theShapes) {
					i.sortingBy = "b";
					
				}
			
			}else if(sortby == "h") {
				for(shapes i:theShapes) {
					i.sortingBy = "h";
					
				}
			}else if(sortby == "a") {
				for(shapes i:theShapes) {
					i.sortingBy = "a";
					
				}
			}
			SortingUtility.bubbleSort(theShapes);
		}else if(method == "i") {
			if(sortby == "b") {
				for(shapes i:theShapes) {
					i.sortingBy = "b";
					
				}
				
			}else if(sortby == "h") {
				for(shapes i:theShapes) {
					i.sortingBy = "h";
					
				}
			}else if(sortby == "a") {
				for(shapes i:theShapes) {
					i.sortingBy = "a";
					
				}
			}
			SortingUtility.insertionSort(theShapes);
		}else if(method == "s") {
			if(sortby == "b") {
				for(shapes i:theShapes) {
					i.sortingBy = "b";
					
				}
			}else if(sortby == "h") {
				for(shapes i:theShapes) {
					i.sortingBy = "h";
					
				}
			}else if(sortby == "a") {
				for(shapes i:theShapes) {
					i.sortingBy = "a";
					
				}
			}
			SortingUtility.selectionSort(theShapes);
		}else if(method == "m") {
			if(sortby == "b") {
				for(shapes i:theShapes) {
					i.sortingBy = "b";
					
				}
			}else if(sortby == "h") {
				for(shapes i:theShapes) {
					i.sortingBy = "h";
					
				}
			}else if(sortby == "a") {
				for(shapes i:theShapes) {
					i.sortingBy = "a";
					
				}
			}
			SortingUtility.mergeSort(theShapes);
		}else if(method == "q") {
			if(sortby == "b") {
				for(shapes i:theShapes) {
					i.sortingBy = "b";
					
				}
			}else if(sortby == "h") {
				for(shapes i:theShapes) {
					i.sortingBy = "h";
					
				}
			}else if(sortby == "a") {
				for(shapes i:theShapes) {
					i.sortingBy = "a";
					
				}
			}
			SortingUtility.quickSort(theShapes);
		}else if(method == "z") {
			if(sortby == "b") {
				for(shapes i:theShapes) {
					i.sortingBy = "b";
					
				}
			}else if(sortby == "h") {
				for(shapes i:theShapes) {
					i.sortingBy = "h";
					
				}
			}else if(sortby == "a") {
				for(shapes i:theShapes) {
					i.sortingBy = "a";
					
				}
			}
			//SortingUtility.customSort(theShapes);
		}
			//if either one of them does not match, print error here, else print I think
		
		//if it is all good
		//Finish timing the sort here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.print("Total time taken is ");
		System.out.println(Long.toString(duration));
		
		//Print the first, last and every thousandth item in the list to verify sort
		
		//print first
		int counter = 0;
		for(shapes i:theShapes){
		counter ++;
			if (counter == 1000) {
				System.out.println("Replace with the corrsponding item for the thousandth object");
			}
		}
	}
}
