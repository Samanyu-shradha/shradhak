package PracticePrograms;

public class AddNumbersOnlyFromString {
    // Accept 'durga123shankar456' as a String and extract the numbers from the string and add the numbers.
    public static void addNumbersOnly(String str){
        int num=0;
        String[] strArray = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].contains("0")||strArray[i].contains("1")||strArray[i].contains("2")||strArray[i].contains("3")||strArray[i].contains("4")||strArray[i].contains("5")||strArray[i].contains("6")||strArray[i].contains("7")||strArray[i].contains("8")||strArray[i].contains("9")){
                num+=Integer.parseInt(strArray[i]);
            }
        }
        System.out.println("The sum of the numbers are: "+num);
    }

    public static void main(String[] args){
        AddNumbersOnlyFromString.addNumbersOnly("durga123sha682nkar456");
    }
}
