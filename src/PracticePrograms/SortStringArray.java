package PracticePrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

    public class SortStringArray {
        static int counter=0;
        static int newCounter=0;
        static int tempNum=0;
        public void sortStringArray(String[] strArray){
            String[] newStrArray = new String[strArray.length];
            String[] descStrArray = new String[strArray.length];
            for(int i=0;i<strArray.length;i++){
                for(int j=0;j<strArray.length;j++){
                    if(strArray[i].length()>strArray[j].length()){
                        counter+=1;
                    }
                    if(i>j & strArray[i].length()==strArray[j].length()){
                        newCounter+=1;
                    }
                }
                newStrArray[counter+newCounter]=strArray[i];
                counter=0;
                newCounter=0;
            }
            System.out.println("The new sorted string array is: "+Arrays.toString(newStrArray));

            for(int k=newStrArray.length-1;k>=0;k--){
                descStrArray[tempNum] = newStrArray[k];
                tempNum++;
            }
            System.out.println("The descending string is: "+Arrays.toString(descStrArray));


        }

        public static void main(String[] args){
            SortStringArray obj = new SortStringArray();
            String[] strArray = {"tiger", "lion", "horse", "cat", "dog", "elephant"};
            obj.sortStringArray(strArray);
        }
    }
