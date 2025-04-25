package PracticePrograms;

import java.util.Arrays;

public class NewProgram {

    public void sortIntegerArrayRemDupl(int[] intArray){
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

        System.out.println("The sorted integer array is: "+ Arrays.toString(intArray));

        int min=0;
        for(int i=1;i<intArray.length;i++){
            if(intArray[min]!=intArray[i]){
                min++;
                intArray[min]=intArray[i];
            }
        }

        System.out.println("The non duplicated string: "+Arrays.toString(Arrays.copyOfRange(intArray,0,min+1)));;

    }

    public static void main(String[] args){
        NewProgram obj = new NewProgram();
        obj.sortIntegerArrayRemDupl(new int[] {1,2,3,4,2,3,6,7,6,8,78,65,78,54});
    }
}
