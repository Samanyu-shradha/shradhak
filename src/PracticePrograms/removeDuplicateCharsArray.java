package PracticePrograms;

import java.util.Scanner;

public class removeDuplicateCharsArray {

	public void removeDuplicateChars(String str){
		StringBuilder strBldr = new StringBuilder();
		StringBuilder strBldr1 = new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(str.indexOf(str.charAt(i), i+1, str.length())==-1){
				strBldr.append(str.charAt(i));
			}
		}
		for(int j=0;j<str.length();j++){
			if(str.indexOf(str.charAt(j), 0, j)==-1){
				strBldr1.append(str.charAt(j));
			}
		}
		System.out.println("The string is: "+strBldr);
		System.out.println("The string is: "+strBldr1);

	}

	public static void main(String[] args){
		removeDuplicateCharsArray obj = new removeDuplicateCharsArray();
		obj.removeDuplicateChars("color");
	}
}