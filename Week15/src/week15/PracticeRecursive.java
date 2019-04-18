package week15;

import java.util.Scanner;

public class PracticeRecursive {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String stringInput = input.nextLine();
	}
	
	public static void PrintIterative(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() -1 -i));
		}
	}
	
	public static void PrintRecursive(String str) {
		//base case
		
		//recursive
	}
	
	public static void PrintRecursiveSubString(String str) {
		//base case
		
		//recursive
	}
	
	public static String getReverse(String str) {
		//base
		if(str.isEmpty()) {
			return "";
		}
		char firstLetter = str.charAt(0);
		String theRest = str.substring(1);
		return getReverse(theRest) + firstLetter;
	}
	
	

	
}
