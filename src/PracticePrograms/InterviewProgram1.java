package PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewProgram1 {
    //Take an Integer array 1,2,3,4,5,6,7 and another input as 4. Output should be 5,6,7,1,2,3,4

    public void rearrangeNumbers(int[] intArray, int num){
        int intArrLen = intArray.length;
        int counter=0;
        int tempLen=0;
        int tempListNum=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int l=0;l<intArrLen;l++){
            list.add(intArray[l]);
        }
        for(int i=0;i<intArrLen;i++){
           counter+=1;
            if(intArray[i] == num){
                tempLen = counter;
                for(int j=0;j<intArrLen-counter;j++){
                    intArray[j] = intArray[tempLen];
                    tempLen+=1;

                }
                for(int k=intArrLen-counter;k<intArrLen;k++){
                    intArray[k]=list.get(tempListNum);
                    tempListNum+=1;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void main(String[] args){
        InterviewProgram1 obj = new InterviewProgram1();
        int[] intArray = {1,2,3,4,5,6,7,8};
        obj.rearrangeNumbers(intArray, 5);
    }
}
