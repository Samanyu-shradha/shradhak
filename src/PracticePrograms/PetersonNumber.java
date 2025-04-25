package PracticePrograms;

public class PetersonNumber {

    public void petersonNumber(int num){
        String[] strArray = String.valueOf(num).split("");
        int finalNum = 0;
        int initialNum =1;
        for(int i=0;i<strArray.length;i++){
            for(int j=Integer.parseInt(strArray[i]);j>0;j--){
                initialNum*=j;
            }
            finalNum+=initialNum;
            initialNum=1;
        }
        if(finalNum == num){
            System.out.println("The number is Peterson Number: "+num);
        }else{
            System.out.println("The number is not Peterson Number: "+num);
        }

    }
    public static void main(String[] args){
        PetersonNumber obj = new PetersonNumber();
        obj.petersonNumber(145);
    }
}
