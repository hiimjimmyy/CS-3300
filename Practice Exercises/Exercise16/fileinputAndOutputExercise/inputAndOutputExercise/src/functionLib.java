import java.io.*;
import java.util.*;

public class functionLib
{
//    public static void main(String[] args)
//    {
//
//        String test = readTheContentOfJavaFileIntoAString();
//        System.out.println("printing the following statement: ");
//        System.out.println(test);
//    }

    public static String readTheContentOfJavaFileIntoAString(String input_plaintext_filename)
    {
        File file = new File(input_plaintext_filename);

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
            {
                return st;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
}
