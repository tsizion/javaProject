// Importing File class
import java.io.File;
import java.io.*;

// Importing the IOException class for handling errors
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class CreateFile {
    public static void main(String args[]) {
        try {
            // Creating an object of a file
            File f0 = new File("D:FileOperationExample.txt");
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
            String name =f0.getName();
            System.out.println(name);
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
        generics gen= new generics();
        gen.setData("tsion");
        gen.setData(395984);




       // PrintWriter outFile = PrintWriter( new FileOutputStream( "D:FileOperationExample.txt" ));
        System.out.println("Enter student first name-> ");
        Scanner reader = new Scanner(System.in);
        String fName=reader.next();
        System.out.println("Enter student second name-> ");
        String sName=reader.next();
        System.out.println("Enter student address-> ");
        String addr=reader.next();
//        outFile.print(fName+ "");
//        outFile.print(sName+ "");
//        outFile.println(addr);
//        outFile.close();

    }
}