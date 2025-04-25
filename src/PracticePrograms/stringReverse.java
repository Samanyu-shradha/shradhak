package PracticePrograms;

import java.util.Scanner;

public class stringReverse{
	public static void reverseString(String strValue) {
		try (Scanner input = new Scanner(System.in)){
			System.out.println("Enter a String:");
			String str = input.next();
			int len = str.length();
			System.out.println("Length is : "+len);
			StringBuilder strBldr = new StringBuilder(len);
			for (int i=len-1;i>=0;i--) {
				strBldr.append(str.charAt(i));
			}
			System.out.println("Reverse String: "+strBldr);
		}
		
	}
	public static void main(String[] args) {
		stringReverse.reverseString("This is a house");
	}
}
