import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        //obtain file path
        String filePath = "/Users/jimmytran/Documents/School Related/Classes/CS 3300/CS-3300/Practice Exercises/Exercise16/fileIntputExercise/src/fileOfNumbers.txt";
        File myFile = new File(filePath);


        //open file, obtain content
        ArrayList<Integer> valuesFromFile = readFileAndReturnContent(myFile);

        //process display and output
        processDisplayAndOutput(valuesFromFile);
    }

    public static void processDisplayAndOutput(ArrayList<Integer> inputList)
    {
        System.out.println("\nConsole Output: ");
        System.out.println("Smallest number in file: "+ Collections.min(inputList));
        System.out.println("Largest number in file: " +Collections.max(inputList));
    }

    public static ArrayList<Integer> readFileAndReturnContent(File inputFileName)
    {
        ArrayList<Integer> valuesFromFile = new ArrayList<>();

        //read file
        try
        {
            //if file is readable, print out content title
            if(inputFileName.canRead())
            {
                System.out.println("File Content:");
            }
            Scanner scanner = new Scanner(inputFileName);
            while(scanner.hasNext())
            {
                String data = scanner.nextLine();
                try
                {
                    Integer stringDataToInteger = Integer.parseInt(data);
                    valuesFromFile.add(stringDataToInteger);
                }
                catch(Exception e)
                {
                    //skip of this value
                }

                System.out.println(data);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

        return valuesFromFile;
    }

}