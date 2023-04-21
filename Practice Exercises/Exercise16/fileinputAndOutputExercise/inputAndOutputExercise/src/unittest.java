//import java.io.File;
//import java.io.PrintWriter;
//import java.sql.Array;
//import java.util.*;
//
//import java.util.Random;
//
//public class unittest {
//
//    public static void Decryption(String c_file, String p_file, int k)
//    {
//        //creating empty input file for decrypted file to write to
//        File outputFile = new File(p_file);
//        try
//        {
//            outputFile.createNewFile();
//            System.out.println("Output file has been sucessfully created.");
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//
//
//        //write to the file
//        ArrayList<String> listOfWordsInTextSentence = new ArrayList<>();
//        File readingCipherTextFile = new File(c_file);
//        try
//        {
//            PrintWriter printWriter = new PrintWriter(outputFile);
//
//            Scanner scanner = new Scanner(readingCipherTextFile);
//            while(scanner.hasNextLine())
//            {
//                String currentLine = scanner.nextLine();
//                String[] currentLineWithSplitApplied = currentLine.split(" ");
//                ArrayList<String> tempArrayList = new ArrayList<>();
//                for (String value : currentLineWithSplitApplied)
//                {
//                    int stringToInteger = Integer.parseInt(value) - k;
//                    char tempIntegerToCh = (char) stringToInteger;
//                    String ChToString = String.valueOf(tempIntegerToCh);
//                    tempArrayList.add(ChToString);
//                }
//                String concatinated_tempArrayList = String.join("",tempArrayList);
//                listOfWordsInTextSentence.add(concatinated_tempArrayList);
//            }
//
//            for(String word : listOfWordsInTextSentence)
//            {
//                printWriter.write(word+ "  ");
//            }
//
//            printWriter.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println("Error reading in cipher text file :: Decryption()");
//            System.out.println(e);
//        }
//
//
//    }
//    public static void main(String[] Args)
//    {
//        String s = "122 115 110 121";
//        int key = 5;
//
//        String[] sSplittedValue = s.split(" ");
//        System.out.println("testing in main");
//        for (String value : sSplittedValue)
//        {
//            int stringToInteger = Integer.parseInt(value) - key;
//            char tempIntegerToCh = (char) stringToInteger;
//        }
//        System.out.println("testing in function:");
//        Decryption("Cipher.txt", "output.txt", key);
//
//
//
////        //creating an array of words
////        String[] words = s.split("\\s+");
////
////        //testing output of array of words
////        for(String word : words)
////        {
////            System.out.println(word);
////        }
////
////        ArrayList<ArrayList<Integer>> typeCastedValues = new ArrayList<>();
////
////        for(String word : words)
////        {
////            ArrayList<Integer> encryptedWord = new ArrayList<>();
////
////            char[] letters = word.toCharArray();
////            for(char ch : letters)
////            {
////                int chToInt = ch + key;
////                encryptedWord.add(chToInt);
////            }
////            typeCastedValues.add(encryptedWord);
////        }
////
////        System.out.println("we are printing the words in encrypted + type casted fomat");
////        for(ArrayList word : typeCastedValues)
////        {
////            System.out.println(word);
////        }
//
//    }
//
////    public static Character[] toCharacterArray( String s )
////    {
////
////        if ( s == null )
////        {
////            return null;
////        }
////
////        int len = s.length();
////        Character[] array = new Character[len];
////        for (int i = 0; i < len ; i++)
////        {
////            array[i] = s.charAt(i);
////        }
////
////        return array;
////    }
//}
