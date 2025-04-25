package PracticePrograms;

import java.util.*;

public class PractiseProgram extends Thread {
    String name;
    PractiseProgram(String name){
        this.name = name;
    }

    public void run(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ex){
            System.out.println("Exception with the run method");
        }

    }

    public static void main(String[] args){
        PractiseProgram obj = new PractiseProgram("New Thread One");
        Thread thread1 = new Thread("New Thread");
        thread1.start();
        int i=0;
        do{
            i+=2;
        }while(i<10);
        System.out.println("The new Thread: "+thread1.getName());
        System.out.println("The status of the thread is: "+obj.getState());
        obj.start();
        System.out.println("The status of the thread after invoking start methods is: "+obj.getState());
        System.out.println("The name of the thread is: "+obj.getName().getBytes());
    }

}



/**

public void linkedListToArray(){
    LinkedList<String> linkList = new LinkedList<String>();
    for(int i=1;i<=10;i++){
        linkList.add("List_"+i);
    }

    System.out.println("The linkedList is: "+linkList);
    System.out.println("The Array converted linked list is: "+Arrays.toString(linkList.toArray()));

}

public static void main(String[] args){
    PractiseProgram obj = new PractiseProgram();
    obj.linkedListToArray();
}

*/


/** //    public void listToMap(List<String> list){
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        int j=0;
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            map.put(++j, iterator.next().toString());
//        }
//        System.out.println("The list conversion to map is: "+map);
//        int j3w=0;
//        for(String str: list){
//            map.put(++j, str);
//        }
//        System.out.println("The list convertion to map is: "+map);
//    }
//
//    public static void main(String[] args){
//        PractiseProgram obj = new PractiseProgram();
//        List<String> list = new ArrayList<>();
//        for(int i=0;i<10;i++){
//            list.add("ListString_"+i);
//        }
//
//        System.out.println(list);
//
//        obj.listToMap(list);


    First Non duplicate character
//    public void returnFirstNonRepeatedChar(String str){
//        char[] charArray = str.toCharArray();
//        char nonDuplicateChar = ' ';
//        for(int i=0;i<str.length();i++){
//            if(str.indexOf(charArray[i], i+1, str.length()) == -1){
//                if(str.indexOf(charArray[i], 0, i)==-1){
//                    nonDuplicateChar = charArray[i];
//                    break;
//                }
//            }
//        }
//        System.out.println("The first non duplicate character is: "+nonDuplicateChar);
//    }
//    public static void main(String[] args){
//        PractiseProgram obj = new PractiseProgram();
//        obj.returnFirstNonRepeatedChar("duplduicatepl");
    }




//    2. Swap two numbers without using a third variable
//    public void swapTwoNumbers(int first, int second){
//        System.out.println("The original numbers are: "+first+" , "+second);
//        String twoNum = String.valueOf(first)+","+String.valueOf(second);
//        String[] strArray = twoNum.split(",");
//        StringBuilder strBldr = new StringBuilder();
//        strBldr.append(strArray[1]);
//        strBldr.append(",");
//        strBldr.append(strArray[0]);
//        String newStr = strBldr.toString();
//        String[] newStrArray = newStr.split(",");
//        int newFirst = Integer.parseInt(newStrArray[0]);
//        int newSecond = Integer.parseInt(newStrArray[1]);
//        System.out.println("The swapped numbers are: "+newFirst+" , "+newSecond);
//    }
//    public static void main(String[] args){
//        PractiseProgram obj = new PractiseProgram();
//        obj.swapTwoNumbers(30,55);
//    }

//    1. String Reverse
//    public String reverseString(String name){
//        char[] charArray = name.toCharArray();
//        char[] newCharArray = new char[name.length()];
//        int begin=0;
//        int end=name.length()-1;
//        while(end>=begin){
//            newCharArray[begin]=charArray[end];
//            newCharArray[end]=charArray[begin];
//            begin++;
//            end--;
//        }
//        return String.valueOf(newCharArray);
//    }
//    public static void main(String[] args){
//        PractiseProgram obj = new PractiseProgram();
//        System.out.println("The reversed string is: "+obj.reverseString("Elephant"));
//    }
}

 */