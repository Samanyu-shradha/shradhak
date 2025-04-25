package PracticePrograms;

import java.io.FileNotFoundException;
//import java.io.*;
import java.io.PrintWriter;

public class TryCatchCheckedException {
    public static void main(String[] args) {


        PrintWriter pw;
        try {
            pw = new PrintWriter("");
            pw.println("saved");
            throw new FileNotFoundException("This is the exception");
        }
// providing the checked exception handler (IOException / FileNotFoundException)
        catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("File saved successfully");
    }
}
