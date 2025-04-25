package PracticePrograms;

import java.util.*;
import java.util.stream.Collectors;

public class StringCollectionJoining {
    public static void main(String[] args){
        List<String> listArray = Arrays.asList("abc", "xyz");
        String finalStr = listArray.stream().collect(Collectors.joining(","));
        System.out.println("The collected string is: "+finalStr);
        Arrays.asList("abc", "xyz");

    }
}
