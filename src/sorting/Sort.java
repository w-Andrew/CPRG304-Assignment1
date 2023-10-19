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
		for (int i = 0; i < s.length; i += 1000) {
			System.out.println(s[i]);
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
				break;

			case ("Cylinder"):
				break;

			case ("PentagonalPrism"):
				shapeArray[i] = new PentagonalPrism(height, width);
				break;

			case ("TringularPrism"):
				shapeArray[i] = new TriangularPrism(height, width);
				break;

			case ("SquarePrism"):
				shapeArray[i] = new SquarePrism(height, width);
				break;
			}

		}
		return shapeArray;
	}
}
