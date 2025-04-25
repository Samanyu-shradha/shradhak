package PracticePrograms;

import java.util.*;

public class AverageNumberOfLetters {

    public void averageNumberOfLetters(String str){
        int length=1;
        List<String> list = new ArrayList<>();
        String[] strArray = str.split(" ");
        String resultStr="";
        for(int i=0;i<strArray.length;i++){
            if(resultStr.indexOf(strArray[i].charAt(0))==-1){
                int initialNum=strArray[i].length();
                for(int j=i+1;j<strArray.length;j++){
                    if(strArray[i].charAt(0)==strArray[j].charAt(0)){
                        initialNum=initialNum+strArray[j].length();
                        length+=1;
                    }
                }
                resultStr=resultStr+strArray[i].charAt(0);
                list.add("The average number of characters of "+strArray[i].charAt(0)+" is: "+(double)initialNum/length);
                length=1;
            }
        }

        for(String s: list){
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "tiger");
        map.put(2, "lion");
        map.put(3, "horse");

        for(Map.Entry<Integer, String> map1: map.entrySet()){
            System.out.println(map1.getKey());
            System.out.println(map1.getValue());
        }


    }

    public static void main(String[] args){
        AverageNumberOfLetters obj = new AverageNumberOfLetters();
        obj.averageNumberOfLetters("No now is definitely not the time");
        System.out.println(Double.parseDouble("2"));
    }
}