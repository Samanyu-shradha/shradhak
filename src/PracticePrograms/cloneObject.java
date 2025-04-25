package PracticePrograms;

public class cloneObject implements Cloneable{

    public int rollNo;
    public String name;

    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public cloneObject(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args){
    try{
        cloneObject obj = new cloneObject(1,"NewName");
        cloneObject cloneObj = (cloneObject)obj.clone();
        System.out.println("The properties of the obj object are: "+obj.rollNo+" "+obj.name);
        System.out.println("The properties of the cloneObj object are: "+cloneObj.rollNo+" "+cloneObj.name);
        System.out.println(obj == cloneObj);
    }catch(CloneNotSupportedException ex){

    }
    }
}
