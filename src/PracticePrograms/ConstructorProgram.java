package PracticePrograms;

public class ConstructorProgram {

    private ConstructorProgram(){
        System.out.println("This is parent class constructor");
    }

    public ConstructorProgram(String str){
        System.out.println(str);
    }
}

class SubClass extends ConstructorProgram{
    private SubClass(){
        super("Hello");
        System.out.println("This is child class constructor");
    }

    public static void main(String[] args){
        ConstructorProgram obj = new SubClass();
//        ConstructorProgram obj1 = new SubClass("Hello");
    }

}
