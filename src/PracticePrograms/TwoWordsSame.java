package PracticePrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoWordsSame {

    public void twoSameWords(String[] strArray){
        int counter=1;
        int newCounter=0;
        int finalCounter=0;
        String[] newStrArray = {};
        char[] newCharArray={};
        for(int i=0;i<strArray.length-1;i++){
            counter+=1;
            if(strArray[i].length()!=strArray[i+1].length()){
                System.out.println("The strings are not equal");
                break;
            }else{
                if(counter==strArray.length){
                    System.out.println("All the words are equal in length");
                }
            }
            newStrArray = new String[strArray.length];
            newCharArray = new char[strArray[i].length()];
        }


        for(int j=0;j<strArray.length;j++){
            char[] charArray = strArray[j].toCharArray();
            for(int k=0;k<strArray[j].length();k++){
                for(int l=0;l<strArray[j].length();l++){
                    if(charArray[k]>charArray[l]){
                        newCounter+=1;
                    }
                }
                newCharArray[newCounter]=charArray[k];
                newCounter=0;
            }
            for(int n=0;n<newCharArray.length;n++){
                if((int)newCharArray[n]==0){
                    newCharArray[n] = newCharArray[n-1];
                }
            }
            newStrArray[j]=Arrays.toString(newCharArray);

        }

        System.out.println("The new string array is: "+Arrays.toString(newStrArray));

        for(int m=0;m<newStrArray.length-1;m++){
            if(!newStrArray[m].equalsIgnoreCase(newStrArray[m+1])){
                System.out.println("The strings are not equal");
                break;
            }else{
                finalCounter+=1;
            }
        }

        if(finalCounter==newStrArray.length-1){
            System.out.println("All the strings are equal");
        }
    }

    public static void main(String[] args){
        TwoWordsSame obj = new TwoWordsSame();
        String[] strArray = {"kjsddbjkjsdkdcb", "bjkjskddkjsddcb", "dcbkdjsdbjdkjsk", "kjbdsdbjkdjskdc", "ksddbjkjskddcjb"};
        obj.twoSameWords(strArray);
    }
}
