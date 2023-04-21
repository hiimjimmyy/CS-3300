package Exercise12;

import java.util.*;

public class HotDogStand
{
    //required instance variables
    private Integer IDNumber;
    private int amountOfHotDogsSold;

    //tracks the total number of hot dogs soldf
    private static int totalHotDogsSoldAmongAllStands;

    //importing function library
    functionLib function = new functionLib();

    //constructor
    public HotDogStand()
    {
        IDNumber = assignID();
        amountOfHotDogsSold = 0;
    }

    //this will simulate the hot dog stand making 1 sell
    public void justSold()
    {
        amountOfHotDogsSold += 1;
        totalHotDogsSoldAmongAllStands += 1;
    }

    //get the total amount of hotdogs, and return it
    public int getTotalHotDogsSoldAmongAllStands()
    {
        return totalHotDogsSoldAmongAllStands;
    }

    //gets the amount of hotdogs sold per stand and returns it
    public int getAmountOfHotDogsSold()
    {
        return amountOfHotDogsSold;
    }

    //function to call justSold() a specified amount of time
    public void incrementTotalHotDogsSoldARandomAmountOfTImes()
    {
        for(int i = 0; i < function.randomValueGeneratedBetween0And50(); i++)
        {
            justSold();
        }
    }

    //assign id and get ID
    public int assignID()
    {
        Random randomValue = new Random();
        int randomHotstandStandID = randomValue.nextInt(100);
        return randomHotstandStandID;
    }

    public int getID()
    {
        return IDNumber;
    }


}
