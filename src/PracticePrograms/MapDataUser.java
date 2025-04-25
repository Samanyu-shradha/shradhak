package PracticePrograms;

import java.security.Key;
import java.util.*;

public class MapDataUser extends Thread {

    public void run() {
        System.out.println("This is the Run Method");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){
            System.out.println("The exception is: "+ ex.getMessage());
        }
    }

    public void mapDataUser(){
        Map<String, Object> mapobj = new TreeMap<>();
        mapobj.put("Hello", "Hello1");
        mapobj.put("", "Hello3");
        mapobj.put("Hello2", "");
        mapobj.put("Hello3", "");
        mapobj.put("", "");

        System.out.println(mapobj.equals(new String()));
        System.out.println(mapobj);

        Map<String, Integer> mapobj1 = new LinkedHashMap<>();
        mapobj1.put("", 1);
        mapobj1.put(" ", 1);
        mapobj1.put("  ", 1);
        System.out.println(mapobj1);

        for(Map.Entry<String, Integer> entry: mapobj1.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println("The key and values are: "+key+" , "+value);
        }

        Set<String> setStr = new TreeSet<>();
        setStr.add("Hello2");
        setStr.add("Hello1");
        setStr.add("Hello3");
        System.out.println(setStr);

        for(String s : setStr){
            System.out.println("The set value is: "+s);
        }

        List<Integer> listNums = new ArrayList<>();
        listNums.add(1);
        listNums.add(1);
        listNums.add(2);
        listNums.add(5);
        listNums.add(4);
        listNums.add(3);

        for(Integer j : listNums){
            System.out.println("The number is: "+j);
        }
    }

    public static void main(String[] args){
        for(int i=0;i<5;i++){
            MapDataUser obj = new MapDataUser();
            obj.mapDataUser();
            obj.start();
        }
    }
}
