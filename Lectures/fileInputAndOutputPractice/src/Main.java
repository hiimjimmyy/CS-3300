import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        PrintWriter outputStream = null;

        System.out.println("writing to file");
        try
        {
            outputStream = new PrintWriter(new FileOutputStream("temp.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

        System.out.println("finsihed writing to file");
    }
}