import java.io.*;
import java.io.BufferedReader;
//import java.io.IOException;

public class fileIO {
    public static void main (String args[])  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("writing to a file ");
            writer.write("\n writing to a file2 ");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line=reader.readLine())!=null)
            System.out.println(line);
reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
