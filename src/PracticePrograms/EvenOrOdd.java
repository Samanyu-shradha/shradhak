package PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EvenOrOdd {

	public void evenOrOdd(int[] intArray){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<intArray.length;i++){
			list.add(intArray[i]);
		}

		System.out.println("The list of integer are: "+list);

		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			int num = iterator.next();
			if(num%2 == 0){
				System.out.println("The number is even: "+num);
			}else{
				System.out.println("The number is odd: "+num);
			}
		}


	}

	public static void main(String[] args){
		EvenOrOdd obj = new EvenOrOdd();
		obj.evenOrOdd(new int[] {1,2,3,4,5,6,7,8,9,10});
	}
}
