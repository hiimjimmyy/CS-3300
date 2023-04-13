package Exercise8;

import java.util.*;


public class searchTwoDArrayList {

    //values to put into array 
    final static Integer[][] valuesForData1 = { { 1,1,3,1,5 },{ 1,1,3,1,5 },{ 1,1,3,1,5 },{ 1,1,3,1,5 },{ 1,1,3,1,5 } };
    final static Integer[][] valuesForData2 = { { 1,2,3,4,5,6,7,8,9,10 },{ -2,-1,2,1},{ },{ 2, 2, 2}};
    
    public static void main(String[] args)
    {

        //initilize 2d arrayList of integers of data1
        ArrayList<ArrayList<Integer>> Data1 = new ArrayList<ArrayList<Integer>>();
        //initalize 2d arayList of integers of data2
        ArrayList<ArrayList<Integer>> Data2 = new ArrayList<ArrayList<Integer>>();
    

        //insert defined data into the array
        Data1 = insertTwoDArrayIntoTwoDArrayList(searchTwoDArrayList.valuesForData1);
        Data2 = insertTwoDArrayIntoTwoDArrayList(searchTwoDArrayList.valuesForData2);


        //intialize arraylist which will catch the coordinates of all the even values within the 2d lists
        ArrayList<Integer> coordinatesOfEvenValuesForData1 = new ArrayList<>();
        ArrayList<Integer> coordinatesOfEvenValuesForData2 = new ArrayList<>();


        //run through searchEven function
        coordinatesOfEvenValuesForData1 = searchEven(Data1);
        coordinatesOfEvenValuesForData2 = searchEven(Data2);

        //process format & display
        System.out.println("\nData 1 Results:");
        Display_Locations(coordinatesOfEvenValuesForData1);
        System.out.println("\nData 2 Results:");
        Display_Locations(coordinatesOfEvenValuesForData2);
       

    }

    public static ArrayList<ArrayList<Integer>> insertTwoDArrayIntoTwoDArrayList(Integer[][] inputArray)
    {
        ArrayList<ArrayList<Integer>> inputTwoDArrayListForInptuArrayInsertion = new ArrayList<>();

        for(Integer[] row: inputArray)
        {
            ArrayList<Integer> rowToInsertIntoReturnTwoDArray = new ArrayList<>();
            for(Integer integerValues : row)
            {
                rowToInsertIntoReturnTwoDArray.add(integerValues);
            }
            inputTwoDArrayListForInptuArrayInsertion.add(rowToInsertIntoReturnTwoDArray);

        }

        return inputTwoDArrayListForInptuArrayInsertion;
    }

    public static ArrayList<Integer> searchEven(ArrayList<ArrayList<Integer>> inputArrayData)
    {
        ArrayList<Integer> returnListOfCoordinates = new ArrayList<>();

        int rowCounter = 0; 
        for(ArrayList<Integer> row : inputArrayData)
        {
            int colCounter = 0;
            for(Integer elementValue : row)
            {
                if(elementValue % 2 == 0)
                {
                    returnListOfCoordinates.add(rowCounter);
                    returnListOfCoordinates.add(colCounter);
                }

                colCounter += 1;
            }
            
            rowCounter += 1;
        }

        //if there was no even numbers, and the list is empty we add -1 and return it.
        if(returnListOfCoordinates.isEmpty())
        {
            returnListOfCoordinates.add(-1);
        }

        return returnListOfCoordinates;
    }

    public static void Display_Locations(ArrayList<Integer> inputList)
    {
        if(inputList.contains(-1))
        {
            System.out.println("This vector did not have any even numbers.");
        }
        else
        {
            for(int i = 0; i < inputList.size(); i += 2)
            {
                System.out.println(inputList.get(i) + " " + inputList.get(i + 1));
            }
        }
    }




    // █▀▀ █░█ █▄░█ █▀▀ ▀█▀ █ █▀█ █▄░█  
    // █▀░ █▄█ █░▀█ █▄▄ ░█░ █ █▄█ █░▀█  
    
    // █▀▀ █▀█ ▄▀█ █░█ █▀▀ █▄█ ▄▀█ █▀█ █▀▄
    // █▄█ █▀▄ █▀█ ▀▄▀ ██▄ ░█░ █▀█ █▀▄ █▄▀

    
    // public static List<Integer> convertArrayToList(Integer[][] inputTwoDArray)
    // {
    //     List<Integer> returnList = new List<Integer>() {
    //         for(Integer[] : inputArray)
    //         {
    //             returnList.addAll()
    //         }
    //     };

    //     return returnList;
    // }
}
