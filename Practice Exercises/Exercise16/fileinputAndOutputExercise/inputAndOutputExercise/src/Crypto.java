import java.util.*;
import java.io.*;
import java.util.*;

public class Crypto
{

    //attributes
    private String plaintext_filename;
    private String ciphertext_filename;
    private int key;

    //importing a function library
    // functionLib functionLibrary = new functionLib();

    Crypto(String input_plaintext_filename, String input_ciphertext_filename, int input_key_value)
    {
        Encrypt(input_plaintext_filename, input_ciphertext_filename, input_key_value);
        System.out.println("\nGenerating decrypted output file...");
        Decryption(input_ciphertext_filename, getOutputFileName(), input_key_value);
    }

    public void Encrypt(String input_plaintext_filename, String input_ciphertext_filename, int input_key_value)
    {
        String fileContentFrominput_plaintext_filename = readTheContentOfJavaFileIntoAString(input_plaintext_filename);

        String[] words = fileContentFrominput_plaintext_filename.split("\\s+");
        ArrayList<ArrayList<Integer>> typeCastedValues = new ArrayList<>();

        for(String word : words)
        {
            ArrayList<Integer> encryptedWord = new ArrayList<>();

            char[] letters = word.toCharArray();
            for(char ch : letters)
            {
                int chToInt = ch + input_key_value;
                encryptedWord.add(chToInt);
            }
            typeCastedValues.add(encryptedWord);
        }

        //write to encrypted file
        try
        {
            FileWriter myWriter = new FileWriter(input_ciphertext_filename);
            for(ArrayList<Integer> row : typeCastedValues)
            {
                for(Integer value : row)
                {
                    myWriter.write(value+ " ");
                }
                myWriter.write("\n");
            }
            myWriter.close();

            System.out.println("\nFile has been encrypted....");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

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


    public static void Decryption(String c_file, String p_file, int k)
    {
        //creating empty input file for decrypted file to write to
        File outputFile = new File(p_file);
        try
        {
            outputFile.createNewFile();
            System.out.println("Output file has been sucessfully created.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        //write to the file
        ArrayList<String> listOfWordsInTextSentence = new ArrayList<>();
        File readingCipherTextFile = new File(c_file);
        try
        {
            PrintWriter printWriter = new PrintWriter(outputFile);

            Scanner scanner = new Scanner(readingCipherTextFile);
            while(scanner.hasNextLine())
            {
                String currentLine = scanner.nextLine();
                String[] currentLineWithSplitApplied = currentLine.split(" ");
                ArrayList<String> tempArrayList = new ArrayList<>();
                for (String value : currentLineWithSplitApplied)
                {
                    int stringToInteger = Integer.parseInt(value) - k;
                    char tempIntegerToCh = (char) stringToInteger;
                    String ChToString = String.valueOf(tempIntegerToCh);
                    tempArrayList.add(ChToString);
                }
                String concatinated_tempArrayList = String.join("",tempArrayList);
                listOfWordsInTextSentence.add(concatinated_tempArrayList);
            }

            for(String word : listOfWordsInTextSentence)
            {
                printWriter.write(word+ " ");
            }

            printWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("Error reading in cipher text file :: Decryption()");
            System.out.println(e);
        }

    }

    public String getOutputFileName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the name of the output file?:");
        return scanner.nextLine() + ".txt";
    }
}
