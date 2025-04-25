package PracticePrograms;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CountLettersNumber {

    public void countNumberOfLetters(int[] intArray){
        int counter=0;
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<intArray.length;i++){
            set.add(intArray[i]);
        }
        System.out.println("The entries of the set are: "+set);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int tempNum=iterator.next();
            for(int j=0;j<intArray.length;j++){
                if(tempNum==intArray[j]){
                    counter+=1;
                }
            }
            System.out.println("The occurances of "+tempNum+" is: "+counter);
            counter=0;
        }
    }

    public static void main(String[] args){
        CountLettersNumber obj = new CountLettersNumber();
        obj.countNumberOfLetters(new int[] {1, 1, 1, 3, 3, 4, 5, 5, 6, 9, 7, 3, 4});
    }
}


//Input:
//int[] arr = {1, 1, 1, 3, 3, 4, 5, 5, 6, 9, 7, 3, 4};
//Output:
//Frequency of 1 is : 3
//Frequency of 3 is : 3
//Frequency of 4 is : 2
//Frequency of 5 is : 2
//Frequency of 6 is : 2