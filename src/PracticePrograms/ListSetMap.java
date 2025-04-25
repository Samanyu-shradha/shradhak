package PracticePrograms;

import java.util.*;

public class ListSetMap {

    public void listSetMap(){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "tiger");
        map1.put(2, "lion");
        map1.put(3, "horse");

        for(Map.Entry<Integer, String> map: map1.entrySet()){
            System.out.println(map.getValue());
            System.out.println(map.getKey());
        }

        List<String> list1 = new ArrayList<>();
        list1.add("tiger");
        list1.add("tiger");
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args){
        ListSetMap obj = new ListSetMap();
        obj.listSetMap();
    }
}
