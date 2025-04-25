package PracticePrograms;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class StringTokenizerClass {

    public void stringTokenizer(){
        StringTokenizer strToken = new StringTokenizer("This is a string tokenizer class");
        System.out.println("The length of tokens are: "+strToken.countTokens());

        while(strToken.hasMoreTokens()){
            System.out.println("The counts are: "+strToken.nextToken());
        }
    }

    public static void main(String[] args){
        StringTokenizerClass obj = new StringTokenizerClass();
        obj.stringTokenizer();
    }
}
