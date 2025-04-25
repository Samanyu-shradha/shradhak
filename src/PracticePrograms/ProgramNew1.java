package PracticePrograms;

public class ProgramNew1 {

    public void returnString(String str){
        char[] charArray = str.toCharArray();
        String tempStr="";
        String finalString="";
        int counter=0;
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<charArray.length;j++){
                if(tempStr.indexOf(charArray[i])==-1){
                    if(charArray[i]==charArray[j]){
                        counter+=1;
                    }
                }
            }
            if(tempStr.indexOf(charArray[i])==-1){
                finalString=finalString+counter+charArray[i];
                counter=0;
            }
            tempStr=tempStr+charArray[i];
        }

        System.out.println("The final string is: "+finalString);
    }

    public static void main(String[] args){
        ProgramNew1 obj = new ProgramNew1();
        obj.returnString("aaaabbbccd");
    }
}

//
//String input = "aaaabbbccd"
//
//output = "4a3b2c1d"

