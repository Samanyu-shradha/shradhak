package PracticePrograms;

public class Program {

    public void uniqueLetters(String str){
        StringBuilder strBldr=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i), 0, i)==-1){
                    strBldr.append(str.charAt(i));
            }
        }
        System.out.println("The string after removing the duplicate characters are: "+strBldr);
    }

    public static void main(String[] args){
        Program obj = new Program();
        obj.uniqueLetters("SRCKNRSDRMSPR");
    }
}
