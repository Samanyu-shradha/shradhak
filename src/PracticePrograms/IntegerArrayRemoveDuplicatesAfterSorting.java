package PracticePrograms;

import java.util.Arrays;

public class IntegerArrayRemoveDuplicatesAfterSorting {

    public void integerArraySortRemDupl(int[] intArray){
        int temp=0;
        for(int i=0;i<intArray.length-1;i++){
            for(int j=i;j<intArray.length-i-1;j++){
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

        System.out.println("The sorted and non duplicate integer array is: "+Arrays.toString(Arrays.copyOfRange(intArray,0,min+1)));
    }

    public static void main(String[] args){
        IntegerArrayRemoveDuplicatesAfterSorting obj = new IntegerArrayRemoveDuplicatesAfterSorting();
        obj.integerArraySortRemDupl(new int[] {2,4,2,3,5,3,9,5,6,7,10,88,45,78,54,88});
    }

}
