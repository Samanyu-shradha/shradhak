package PracticePrograms;

import java.util.Arrays;

public class Interview {

    public void printMissingNumbers(int[] intArray){
        int lowNum=0;
        int highNum=0;
        int counter=0;
        for(int i=0;i<intArray.length;i++){
            if(i==0){
                if(intArray[i]<=intArray[i+1]){
                    lowNum = intArray[i];
                    highNum = intArray[i+1];
                }else{
                    lowNum = intArray[i+1];
                    highNum = intArray[i];
                }
            }else{
               if(intArray[i]<=lowNum){
                   lowNum= intArray[i];
               }

               if(intArray[i] >= highNum){
                   highNum = intArray[i];
               }
            }
        }

        System.out.println("The lowest number is: "+lowNum);
        System.out.println("The highest number is: "+highNum);

        for(int j=lowNum+1;j<highNum;j++){
            for(int k=0;k<intArray.length;k++){
                if(j==intArray[k]){
                    counter+=1;
                }
            }
            if(counter>0){
                counter=0;
            }else{
                System.out.println("The numbers are: "+j);
            }
        }
    }

    public static void main(String[] args){
        Interview obj = new Interview();
        int[] intArray = {6,12,9,16,19};
        obj.printMissingNumbers(intArray);
    }
}


//Method integer number and convert to a string

