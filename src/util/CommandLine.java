package util;

import java.io.File;

public class CommandLine {
	//String input = System.console().readLine();
	public static void main(String[] args) {
		File filePath = null;//so it does not cause undefined error or something
		String sortby = null;//What to sort by, v, h, base
		String method = null;//What sorting method to use
		if(args.length < 3) {
			System.out.println("This program need 3 inputs");
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
			if(ch == '-' && ch2 == 'f') {
				if(filePath != null) {
					System.out.println("You are define the file or path  atleast twice, program will attempt to use the secound one");
				}
				filePath = new File(arg.substring(2));
			}
		}
		if(filePath == null) {
			System.out.println("You need to use -f and then file name or path inorder to use this program.");
		}
		if(method == null) {
			System.out.println("You did not entered a sorting algorthim to sort by, please use -s and immediately follow by 'b','s','i','m','q' or 'z' ex'-sz'");
		}
		if(sortby == null) {
			System.out.println("You have not enter a value to sort by, use -t and immediately follow by 'b' 'h' or 'a' ex '-th'");
		}
		
		System.out.println(filePath);
		
		//Initialize the array of object here
		
		//based on selected method use if else to take, also time it
		
		//if either one of them does not match, print error here, else print I think
	}
}
