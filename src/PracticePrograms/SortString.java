package PracticePrograms;

import com.sun.source.tree.Tree;

import java.util.*;

public class SortString {

    public void sortString(String str){
        char[] charArray = str.toCharArray();
        char temp=' ';
        for(int i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-1;j++){
                if(charArray[j]>charArray[j+1]){
                    temp=charArray[j];
                    charArray[j]=charArray[j+1];
                    charArray[j+1]=temp;
                }
            }
        }
        Set<Character> set = new LinkedHashSet<>();
        for(int k=charArray.length-1;k>=0;k--){
            set.add(charArray[k]);
        }
        System.out.println(Arrays.toString(charArray));
        System.out.println(set);
        System.out.println(set);
        String str1 = set.toString();
        System.out.println(str1);


    }

    public static void main(String[] args){
        SortString obj = new SortString();
        obj.sortString("duplicate");
    }
}