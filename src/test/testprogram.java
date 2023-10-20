package test;

import java.util.Scanner;

public class testprogram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the filepath");
		String file = scanner.nextLine();
		System.out.println("Enter the methid to sort by");
		String method = scanner.nextLine();
		System.out.println("Enter what to sort by");
		String sortBy = scanner.nextLine();
	
		scanner.close();
	}
}
