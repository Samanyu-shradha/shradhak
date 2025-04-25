package PracticePrograms;

public class BuzzNumber {

    public void buzzNumber(int num){
        if(num%7==0 || num%10==7){
            System.out.println("The number is a Buzz Number");
        }else{
            System.out.println("The number is not a Buzz Number");
        }
    }

    public static void main(String[] args){
        BuzzNumber obj = new BuzzNumber();
        obj.buzzNumber(43);
    }
}
