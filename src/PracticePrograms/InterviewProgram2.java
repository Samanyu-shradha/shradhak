package PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterviewProgram2 {

    int counter=1;
    int primeNumCounter=0;
    int nonPrimeNumCounter=0;
    public void primeNumberCalculation(){

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=100;i++){
            list.add(i);
        }
        System.out.println("The elements of the list are: "+list);

        for(int j: list){
            if(j==1){
                System.out.println(j+" is not a Prime Number");
                nonPrimeNumCounter+=1;
            }else if(j==2 || j==3){
                System.out.println(j+" is a Prime Number");
                primeNumCounter+=1;
            }else if(j>3 && j<10){
                for(int k=2;k<=j/2;k++){
                    if(j%k == 0){
                        System.out.println(j+" is not a Prime Number");
                        nonPrimeNumCounter+=1;
                        break;
                    }else{
                        counter+=1;
                        if(counter == j/2){
                            System.out.println(j+" is a Prime Number");
                            primeNumCounter+=1;
                            counter=1;
                            break;
                        }
                    }
                }
            }else{
                if(j%2==0 || j%3==0 || j%4==0 || j%5==0 || j%6==0 || j%7==0 || j%8==0 || j%9==0){
                    System.out.println(j+" is not a Prime Number");
                    nonPrimeNumCounter+=1;
                }else{
                    System.out.println(j+" is a Prime Number");
                    primeNumCounter+=1;
                }
            }
        }

        System.out.println("The total number of Prime Numbers are: "+primeNumCounter);
        System.out.println("The total number of Non Prime Numbers are: "+nonPrimeNumCounter);
    }

    public static void main(String[] args){
        InterviewProgram2 obj = new InterviewProgram2();
        obj.primeNumberCalculation();
    }
}


//        for(int i=1;i<=100;i++){
//            list.add(i);
//        }
//        for(int i : list){
//            if(i==2 || i==3 ||i==4 || i==5 || i==6 || i==7 || i==8 || i==9){
//                for(int j=2; j<=9;j++){
//
//                }
//            }else{
//                if(i%2 ==0 || i%3 ==0 || i%4 ==0 || i%5 ==0 || i%6 ==0 || i%7 ==0 || i%8 ==0 || i%9 ==0 ){
//                    System.out.println("The number is not a prime number"+i);
//                }else{
//                    System.out.println("The number is a prime number"+i);
//                }
//            }
//
//        }
//        String str = list.toString();
//        System.out.println(str);
//        String[] strArray = str.split(",");
//        StringBuilder strBldr = new StringBuilder();
//
//        System.out.println(strArray);
//        System.out.println(strArray[1]);
//        for(int i=0;i<strArray.length;i++){
//            if(Integer.parseInt(strArray[i])%2 == 0 || Integer.parseInt(strArray[i])%3 == 0 || Integer.parseInt(strArray[i])%4 == 0 || Integer.parseInt(strArray[i])%5 == 0 || Integer.parseInt(strArray[i])%6 == 0 || Integer.parseInt(strArray[i])%7 == 0 || Integer.parseInt(strArray[i])%8 == 0 || Integer.parseInt(strArray[i])%9 == 0){
//                System.out.println("The number is not a prime number"+i);
//            }else {
//                System.out.println("The number is a prime number"+i);
//            }
//        }


