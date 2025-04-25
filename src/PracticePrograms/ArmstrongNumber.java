package PracticePrograms;

import java.io.Serializable;
import java.util.Arrays;

public class ArmstrongNumber implements Cloneable, Serializable {

    public void armstrongNumber(int num){
        String str = String.valueOf(num);
        int strLen = str.length();
        double finalResult = 0.0;
        for(int i=0;i<strLen;i++){
            finalResult += Math.pow(Double.parseDouble(String.valueOf(str.charAt(i))), Double.parseDouble(String.valueOf(strLen)));
        }
        int finalNum = (int) finalResult;
//        int finalNum = Integer.parseInt(String.valueOf(finalResult));
        System.out.println("The final number is: "+finalNum);
        validateIfArmstrongOrNot(num, finalNum);
    }

    public void validateIfArmstrongOrNot(int num, int finalNum){
        if(num == finalNum){
            System.out.println("The number is an armstrong number: "+num);
        }else if(num<=0){
            System.out.println("The number cannot be negative or zero: "+num);
        }else{
            System.out.println("The number is not an armstrong number: "+num);
        }
    }

    public int[][] retrunTwoDimensionalArray(){
        return new int[][]{{1}, {2,3,4}};
    }

    public static void main(String[] args){
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.armstrongNumber(10);
        System.out.println(obj.retrunTwoDimensionalArray()[1][0]);
    }
}
