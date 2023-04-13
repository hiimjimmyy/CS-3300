package Lectures;
import java.util.*;

public class twoDArrayListPopulation {
    public static void main(String[] args) {
        // Create a new 2D array list
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        // Set the dimensions of the array
        int numRows = 5;
        int numCols = 3;

        // Create a new random number generator
        Random rand = new Random();

        // Loop through each row
        for (int i = 0; i < numRows; i++) 
        {
            // Create a new row list
            ArrayList<Integer> row = new ArrayList<>();

            // Loop through each column
            for (int j = 0; j < numCols; j++)
            {
                // Generate a random number between 0 and 99
                int randomNum = rand.nextInt(100);

                // Add the random number to the row list
                row.add(randomNum);
            }

            // Add the row list to the 2D array list
            array.add(row);
        }

        // Print the 2D array list
        System.out.println(array);
    }
}
