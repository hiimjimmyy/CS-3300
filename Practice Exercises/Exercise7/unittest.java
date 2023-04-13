package Exercise7;
 import java.util.*;


public class unittest {
    
    public static void main(String[] args)
    {
        arrayList arrayListObject = new arrayList();
       
        //declaring 2D ArrayList
        ArrayList<ArrayList<Integer>> fiveByFiveArrayListWithRandomValues = new ArrayList<>();

        //define size of 2d array matrix
        int rowSize = 5;
        int colSize = 5;
        
        //populate array list with random generated numbers
        fiveByFiveArrayListWithRandomValues = arrayListObject.populate_RowSize_ColSize_ListWithRandomValues(rowSize, colSize);

        //display process and format fiveByFiveArrayListWithRandomValues
        arrayListObject.displayContentOfTwoDArrayList(fiveByFiveArrayListWithRandomValues, rowSize, colSize);

        /*
         * we can create two seprate functions
         * one that will take 
        */

    }
    
}
