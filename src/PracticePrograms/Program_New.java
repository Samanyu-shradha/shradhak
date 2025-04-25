package PracticePrograms;

import java.util.*;

class Program_New {

    public void sortStrArray(String[] strArray){
        for(int i=0;i<strArray.length-1;i++){
            for(int j=0;j<strArray.length-1;j++){
                if(strArray[j].compareTo(strArray[j+1])>0){
                    String temp = strArray[j];
                    strArray[j]=strArray[j+1];
                    strArray[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted string array is: "+Arrays.toString(strArray));
    }

    public static void main(String[] args){
        Program_New obj = new Program_New();
        obj.sortStrArray(new String[] {"Hello", "Ant", "Cat", "Elephant", "Lion"});
    }
}
