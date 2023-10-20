package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import shapes.*;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "G:\\temp\\polyNameBIG.txt";
		shapes s[] = getShapes(test);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		SortingUtility su = new SortingUtility();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getHeight());
		}
		su.insertionSort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getHeight());
		}
	}

	private static shapes[] getShapes(String filePath) {
		//
		File file = new File(filePath);
		Scanner read = null;
		int length = 0;
		try {
			read = new Scanner(file);
			length = read.nextInt();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		shapes[] shapeArray = new shapes[length];
		String shapeType;
		double height;
		double width;

		for (int i = 0; i < length; i++) {
			shapeType = read.next();
			height = read.nextDouble();
			width = read.nextDouble();

			switch (shapeType) {
			case ("Cone"):
				shapeArray[i] = new Cone(height, width);
				break;

			case ("Cylinder"):
				shapeArray[i] = new Cylinder(height, width);
				break;

			case ("PentagonalPrism"):
				shapeArray[i] = new PentagonalPrism(height, width);
				break;

			case ("TriangularPrism"):
				shapeArray[i] = new TriangularPrism(height, width);
				break;

			case ("SquarePrism"):
				shapeArray[i] = new SquarePrism(height, width);
				break;

			case ("OctagonalPrism"):
				shapeArray[i] = new OctagonalPrism(height, width);
				break;

			case ("Pyramid"):
				shapeArray[i] = new Pyramid(height, width);
				break;
			}

		}
		return shapeArray;
	}
}
