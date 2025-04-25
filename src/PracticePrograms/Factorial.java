package PracticePrograms;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Factorial {

    public void factorialNumber(int factNum) throws MalformedURLException, ArrayIndexOutOfBoundsException, URISyntaxException {
        int finalfactNum=1;
        for(int i=factNum;i>0;i--){
            finalfactNum*=i;
        }

        System.out.println("The factorial of "+factNum+" is: "+finalfactNum);
//        try{
//            int num = 10/0;
//        }catch(ArithmeticException ex){
//            System.out.println(ex.getMessage());
//            System.out.println("Arithmetic Exception Occurs");
//        }
try{
    int[] intArray = {1,2,3,4,5};
    System.out.println(intArray[7]);
}catch(IndexOutOfBoundsException ex){
    System.out.println(ex.getMessage());
}

        URI uri = new URI("http://127.0.0.1:4723/wd/hub");
        URL url = uri.toURL();

    }

    public static void main(String[] args){
        Factorial obj = new Factorial();
        try{
            obj.factorialNumber(5);
        }catch(MalformedURLException ex){
            System.out.println("MalformedURLException caught");
        }catch(URISyntaxException ex1){
            System.out.println("URI Exception Caught");
        }

    }

}
