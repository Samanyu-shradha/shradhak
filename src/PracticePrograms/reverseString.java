package PracticePrograms;

import java.util.Scanner;

public class reverseString {
	public static void revString(String strValue) {

			try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter the string.");
				String str = input.next();
				char[] charArray = str.toCharArray();
				int len = str.length();
				int begin = 0;
				int end = len - 1;
				char temp;
				while (end >= begin) {
					temp = charArray[begin];
					charArray[begin] = charArray[end];
					charArray[end] = temp;
					end--;
					begin++;
				}

				System.out.println("Reverse String is: "+new String(charArray));
				System.out.println("Reverse String is: "+String.valueOf(charArray));
			}
	}
	
	public static void main(String[] args) {
		reverseString.revString("This is a House");
	}
}
