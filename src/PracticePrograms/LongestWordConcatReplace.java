package PracticePrograms;

import java.util.Arrays;

public class LongestWordConcatReplace {

    public void longestWordConcatReplace(String[] strArray){
        int count=0;
        String strToBeAdded="toBeAppendedString";
        String longestString="";
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].length()>count){
                longestString = strArray[i];
                count=strArray[i].length();
            }
        }
        System.out.println("The longest word is: "+longestString+" and the length is: "+count);
        String newAppendedStr = longestString.concat(strToBeAdded);
        System.out.println("The new concated strinbg is: "+newAppendedStr);

        char[] charArray = newAppendedStr.toCharArray();

        for(int j=2;j<charArray.length;j+=3){
            charArray[j] = 'X';
        }

        StringBuilder strBldr = new StringBuilder();
        for(int k=0;k<charArray.length;k++){
            strBldr.append(charArray[k]);
        }
        System.out.println(String.format("The replaced string is: " + strBldr));

    }

    public static void main(String[] args){
        LongestWordConcatReplace obj = new LongestWordConcatReplace();
        String[] strArray = {"God", "Stranyyyger", "Duplicate", "Forever"};
        obj.longestWordConcatReplace(strArray);
    }
}
