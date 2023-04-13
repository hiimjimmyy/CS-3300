package Exercise7;
import java.util.*;

public class arrayList {

    public static void main(String[] args)
    {

        //declaring 2D ArrayList
        ArrayList<ArrayList<Integer>> fiveByFiveArrayListWithRandomValues = new ArrayList<>();

        //define size of 2d array matrix
        final int rowSize = 5;
        final int colSize = 5;

        //populate array list with random generated numbers
        fiveByFiveArrayListWithRandomValues = populate_RowSize_ColSize_ListWithRandomValues(rowSize, colSize);

        //display process and format fiveByFiveArrayListWithRandomValues
        System.out.println("\nRandom Numbers");
        displayContentOfTwoDArrayList(fiveByFiveArrayListWithRandomValues);

        
        //dividng odds and evens in ArrayList
        //declaring two sepearte arrays
        ArrayList<Integer> evenNumbersExtractedFromFunction;
        ArrayList<Integer> oddNumbersExtractedFromFunction;

        //taking the even numbers out of the 2d array and pushing them into the array list of even numbers
        evenNumbersExtractedFromFunction = SeperateEvensFromTwoDArrayListInput(fiveByFiveArrayListWithRandomValues);

        
        //taking the odd numbers out of the 2d array and pushing them into the arraylist of odd nunbers
        oddNumbersExtractedFromFunction = SeperateOddsFromTwoDArrayListInput(fiveByFiveArrayListWithRandomValues);

        //display process and format even numbers
          System.out.println("\nEven Numbers:");
        displayContentsOfArrayList(evenNumbersExtractedFromFunction);

        //display process andf ormat odd numbers
        System.out.println("\nOdd Numbers:");
        displayContentsOfArrayList(oddNumbersExtractedFromFunction);

        System.out.println("\n");
    }

    public static void displayContentOfTwoDArrayList(ArrayList<ArrayList<Integer>> inputTwoDArrayList)
    {
        for(ArrayList<Integer> row : inputTwoDArrayList)
        {
            for(int elementValue: row)
            {
                System.out.print(elementValue + " ");
            }
            System.out.println(" ");
        }
    }

    public static void displayContentsOfArrayList(ArrayList<Integer> inputArrayList)
    {
        for(int i = 0; i < inputArrayList.size(); i++)
        {
            System.out.print(inputArrayList.get(i) + " ");
        }
    }

    public static ArrayList<ArrayList<Integer>> populate_RowSize_ColSize_ListWithRandomValues(int sizeOfRow, int sizeOfCol)
    {   
        ArrayList<ArrayList<Integer>> return2DArrayWithRandomValues = new ArrayList<>();
        Random randomObj = new Random();

        for(int i = 0; i < sizeOfRow; i++)
        {
            ArrayList<Integer> columnsToInsertIntoArrayList = new ArrayList<>();

            for(int j = 0; j < sizeOfCol; j++)
            {
                int randomNumberBetweenZeroAndNinetyNine = randomObj.nextInt(100);

                columnsToInsertIntoArrayList.add(randomNumberBetweenZeroAndNinetyNine);
            }

            return2DArrayWithRandomValues.add(columnsToInsertIntoArrayList);
        }

        return return2DArrayWithRandomValues;
    }

    public static ArrayList<Integer> SeperateEvensFromTwoDArrayListInput(ArrayList<ArrayList<Integer>> inputTwoDArrayList)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(ArrayList<Integer> row : inputTwoDArrayList)
        {
            for(int elementValue : row)
            {
                if(elementValue % 2 == 0)
                {
                    evenNumbers.add(elementValue);
                }
            }
        }

        return evenNumbers;
    }

    public static ArrayList<Integer> SeperateOddsFromTwoDArrayListInput( ArrayList<ArrayList<Integer>> inputTwoDArrayList)
    {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(ArrayList<Integer> row : inputTwoDArrayList)
        {
            for(int elementValue : row)
            {
                if(elementValue % 2 != 0)
                {
                    oddNumbers.add(elementValue);
                }
            }
        }
        
        return oddNumbers;
    }

}
