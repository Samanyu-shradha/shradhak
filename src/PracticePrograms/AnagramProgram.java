package PracticePrograms;

import java.util.*;

public class AnagramProgram {

    public void anagramString(String str1, String str2){
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();

        String sortedStr1="";
        String sortedStr2="";
        if(str1.length()!=str2.length()){
            System.out.println("The strings are not anagram");
        }else{
            for(int i=0;i<str1.length();i++){
                set1.add(String.valueOf(str1.charAt(i)));
                set2.add(String.valueOf(str2.charAt(i)));
            }
            System.out.println("Set1: "+set1);
            System.out.println("Set2: "+set2);

            Iterator<String> iterator1 = set1.iterator();
            Iterator<String> iterator2 = set2.iterator();

            while(iterator1.hasNext()){
                sortedStr1=sortedStr1+iterator1.next();

            }

            while(iterator2.hasNext()){
                sortedStr2=sortedStr2+iterator2.next();
            }

            if(sortedStr1.equals(sortedStr2)){
                System.out.println("The strings are anagram");
            }else{
                System.out.println("The strings are not anagram");
            }

        }
        Map<Integer, String> map = new HashMap<>();
        for(Map.Entry<Integer, String> map1: map.entrySet()){
        }
    }

    public static void main(String[] args){
        AnagramProgram obj = new AnagramProgram();
        obj.anagramString("Listen", "siLent");
    }

}
