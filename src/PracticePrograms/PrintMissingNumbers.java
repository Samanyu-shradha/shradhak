package PracticePrograms;

import java.util.*;

public class PrintMissingNumbers {

    public void printMissingNumbers(int[] intArray){
        int minNum=intArray[0];
        int maxNum=intArray[0];
        int counter=0;
        for(int i=1;i<intArray.length;i++){
            if(minNum>intArray[i]){
                minNum=intArray[i];
            }
            if(maxNum<intArray[i]){
                maxNum=intArray[i];
            }
        }
        System.out.println("The minimum and maximum numbers are: "+minNum+" and "+maxNum);

        for(int j=minNum+1;j<maxNum;j++){
            for(int k=0;k<intArray.length;k++){
                if(j==intArray[k]){
                    counter+=1;
                }
            }
            if(counter==0){
                System.out.println(j);
            }else{
                counter=0;
            }
        }
    }

    public static void main(String[] args){
        PrintMissingNumbers obj = new PrintMissingNumbers();
        obj.printMissingNumbers(new int[] {8,12,16,6,19});
    }
}
