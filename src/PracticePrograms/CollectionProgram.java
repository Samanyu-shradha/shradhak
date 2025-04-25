package PracticePrograms;

import java.util.*;

public class CollectionProgram {

    public final int num;
    public CollectionProgram() {
        num = 1;
    }

    public static final int num1;
    static{
        num1=1;
    }

    public void collectionMethod(){
        List<String> list1 = new ArrayList<>();
        list1.add("lion");
        list1.addFirst("tiger");
        list1.addLast("horse");
        list1.addFirst("elephant");
        list1.addLast("giraffe");

        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list1);

        for(String s: list1){
            System.out.println(s);
        }

        Map<Integer, String> map1 = new HashMap<>();
        

    }

    public static void main(String[] args){
        CollectionProgram obj = new CollectionProgram();
        obj.collectionMethod();
    }
}
