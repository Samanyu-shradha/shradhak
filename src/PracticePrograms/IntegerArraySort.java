package PracticePrograms;

import java.util.*;

public class IntegerArraySort {

    public void integerArraySort(int[] intArray){
        int temp=0;
        for(int i=0;i<intArray.length-1;i++){
            for(int j=0;j<intArray.length-i-1;j++){
                if(intArray[j]>intArray[j+1]){
                    temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted integer array is: "+Arrays.toString(intArray));

        int min=0;
        for(int i=1;i<intArray.length;i++){
            if(intArray[min]!=intArray[i]){
                min++;
                intArray[min]=intArray[i];
            }
        }

        System.out.println("The integer array after removing duplicates is: "+Arrays.toString(Arrays.copyOfRange(intArray,0,min+1)));
    }

    public static void main(String[] args){
        IntegerArraySort obj = new IntegerArraySort();
        obj.integerArraySort(new int[] {2,6,5,2,6,8,9,8,3,45,62});
    }
}


