package PracticePrograms;

public class IntReverseWithoutString {

    public void integerReverse(int num){
        int finalNum=num%10;
        num=num/10;
        while(num>0){
            finalNum=finalNum*10+num%10;
            num=num/10;
        }

        System.out.println("The reversed number is: "+finalNum);

    }

    public static void main(String[] args){
        IntReverseWithoutString obj = new IntReverseWithoutString();
        obj.integerReverse(5628);
    }
}
