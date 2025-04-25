package PracticePrograms;

public class stringPallindrome {

    public void palindromeMethod(String str){
        String reversedString = "";
        char[] charArray = str.toCharArray();
        for(int i=charArray.length-1;i>=0;i--){
            reversedString=reversedString+charArray[i];
        }
        System.out.println("The string is: "+str);
        System.out.println("The reversed string is: "+reversedString);

        if(str.equals(reversedString)){
            System.out.println("The strings are palindrome");
        }else{
            System.out.println("The strings are not palindrome");
        }
    }

    public static void main(String[] args){
        stringPallindrome obj = new stringPallindrome();
        obj.palindromeMethod("heleh");
    }
}
