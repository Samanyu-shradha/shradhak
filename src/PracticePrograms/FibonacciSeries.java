package PracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	public int[] fibonacciSeries(){
		int[] intArray = new int[10];
		int temp=0;
		int firstNum=0;
		int secNum=1;
		for(int i=0;i<10;i++){
			if(i<2){
				intArray[i] = i;
			}else{
				temp=firstNum+secNum;
				firstNum=secNum;
				secNum=temp;
				intArray[i] = temp;
			}
		}
		System.out.println("The fibonacci series is: "+Arrays.toString(intArray));
		return intArray;
	}

	public static void main(String[] args){
		FibonacciSeries obj = new FibonacciSeries();
		System.out.println(Arrays.toString(obj.fibonacciSeries()));
	}
}