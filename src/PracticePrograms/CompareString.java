package PracticePrograms;

import java.util.Arrays;

public class CompareString {

    public void anagramString(String str1, String str2){
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        String sortedStr1="";
        String sortedStr2="";
        char temp=' ';
        for(int i=0;i<str1.length()-1;i++){
            for(int j=0;j<str1.length()-i-1;j++){
                if(charArray1[j]>charArray1[j+1]){
                    temp=charArray1[j];
                    charArray1[j]=charArray1[j+1];
                    charArray1[j+1]=temp;
                }
            }
        }

        temp=' ';

        for(int i=0;i<str2.length()-1;i++){
            for(int j=0;j<str2.length()-i-1;j++){
                if(charArray2[j]>charArray2[j+1]){
                    temp=charArray2[j];
                    charArray2[j]=charArray2[j+1];
                    charArray2[j+1]=temp;
                }
            }
        }

        sortedStr1=Arrays.toString(charArray1);
        sortedStr2=Arrays.toString(charArray2);

        if(sortedStr1.equals(sortedStr2)){
            System.out.println("The strings are anagram"+sortedStr1+" , "+sortedStr2);
        }else{
            System.out.println("The strings are not anagram"+sortedStr1+" , "+sortedStr2);
        }

    }

    public static void main(String[] args){
        CompareString obj = new CompareString();
        obj.anagramString("listen", "silent");
    }
}
