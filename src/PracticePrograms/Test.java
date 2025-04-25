package PracticePrograms;

import java.util.Arrays;

public class Test {

    public void integerArrayRemDuplicateAndSort(int[] intArray){
        int temp=0;
        for(int i=0;i<intArray.length-1;i++){
            for(int j=0;j<intArray.length-1;j++){
                if(intArray[j]>intArray[j+1]){
                    temp=intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted integer array is: "+ Arrays.toString(intArray));

        int min=0;
        for(int i=1;i<intArray.length;i++){
            if(intArray[min]!=intArray[i]){
                min++;
                intArray[min]=intArray[i];
            }
        }

        System.out.println("The sorted and non duplicate integer array is: "+Arrays.toString(Arrays.copyOfRange(intArray,0,min+1)));
    }

    public static void main(String[] args){
        Test obj = new Test();
        obj.integerArrayRemDuplicateAndSort(new int[] {1,2,5,2,7,5,99,56,44,99,56});
    }
}
