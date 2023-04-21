import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)
    {
        //create a message and put that message into a blank file
       String messageToPushToFile = createMessage();
       String nameOfPlainTextFile = createPlaintFileWithMessage(messageToPushToFile);

       //create a blank message to put the cipher into
        File cipherTextFile = createBlankCipherTextFile("Cipher.txt");
        String nameOfCipherTextFile = cipherTextFile.toString();

        //instantiate Crypto object
        int input_keyValue = obtainKeyFromUser();
        Crypto C = new Crypto(nameOfPlainTextFile, nameOfCipherTextFile,input_keyValue);

        System.out.println("Program terminated.");
    }

    public static int obtainKeyFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer to be used as the key: ");
        do
        {
            try
            {
                return scanner.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println("Please input a valid integer");
            }
        }
        while(true);
    }


    public static File createBlankCipherTextFile(String inputFilePath)
    {
        File cipherTextFile = new File(inputFilePath);
        try
        {
            cipherTextFile.createNewFile();
            System.out.println("Cipher text file has been created.");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        return cipherTextFile;
    }

    public static String createMessage()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a message to encrypt:");
        return scanner.nextLine();
    }

    public static String createPlaintFileWithMessage(String messageToPushToFile)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of this file: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName + ".txt");

        do
        {
            if(!file.exists())
            {
                try
                {
                    file.createNewFile();
                    PrintWriter printWriter = new PrintWriter(file);
                    printWriter.write(messageToPushToFile);
                    System.out.println("\nfile: " + fileName+ " \nhas been created.\n");
                    printWriter.close();
                    break;
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                System.out.println("this file exists.. please pick another name for the file: ");
                fileName = scanner.nextLine();
                file = new File(fileName + ".txt");
            }
        }
        while(true);

        return fileName + ".txt";
    }
}