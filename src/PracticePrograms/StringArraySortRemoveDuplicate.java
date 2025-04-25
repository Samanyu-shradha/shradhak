package PracticePrograms;

import java.awt.*;
import java.util.Arrays;

public class StringArraySortRemoveDuplicate {

    public void stringSortRemDuplicate(String str){
        char[] charArray = str.toCharArray();
        char temp = ' ';
        for(int i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-i-1;j++){
                if(charArray[j]>charArray[j+1]){
                    temp=charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted string is: "+Arrays.toString(charArray));

        int min=0;
        for(int i=1;i<str.length();i++){
            if(charArray[min]!=charArray[i]){
                min++;
                charArray[min]=charArray[i];
            }
        }

        System.out.println("The sorted and non duplicate string is: "+Arrays.toString(Arrays.copyOfRange(charArray,0,min+1)));
    }

    public static void main(String[] args){
        StringArraySortRemoveDuplicate obj = new StringArraySortRemoveDuplicate();
        obj.stringSortRemDuplicate("ddaabbssffzz");
    }
}
