package PracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Spliterator;

public class Sum_Of_3_Numbers_Nearing_Target_1 {

    public void sumOfThreeNumbersNearingTarget(int[] intArray, int num){
        int sum=0;
        int counter=0;
        int initialSum=-0;
        int[] numArray = new int[3];
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                for(int k=j+1;k<intArray.length;k++){
                    if(counter==0){
                        initialSum=intArray[i]+intArray[j]+intArray[k];
                        numArray[0]=intArray[i];
                        numArray[1]=intArray[j];
                        numArray[2]=intArray[k];
                        counter+=1;
                    }else{
                        sum=intArray[i]+intArray[j]+intArray[k];
//                        if(Math.abs(sum-num) < Math.abs(initialSum-num)){
//                            numArray[0]=intArray[i];
//                            numArray[1]=intArray[j];
//                            numArray[2]=intArray[k];
//                            initialSum=sum;
//                        }
                        if((sum-num) < (initialSum-num)){
                            numArray[0]=intArray[i];
                            numArray[1]=intArray[j];
                            numArray[2]=intArray[k];
                            initialSum=sum;
                        }
                    }
                }
            }
        }
        System.out.println("The 3 set of numbers whose sum is nearing num is: "+Arrays.toString(numArray));
    }

    public static void main(String[] args){
        Sum_Of_3_Numbers_Nearing_Target_1 obj = new Sum_Of_3_Numbers_Nearing_Target_1();
        int[] intArray = {1,3,6,0,8};
        obj.sumOfThreeNumbersNearingTarget(intArray, 1);
    }
}
