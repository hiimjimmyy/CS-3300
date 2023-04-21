package Exercise11;

import java.util.*;

import Lectures.hashtableDemo;
import Lectures.inputOutput;

public class data 
{
    //imported function tools
    functionLibrary functionLib = new functionLibrary();

    //private array list
    private ArrayList<Integer> numbers = new ArrayList<Integer>();


    public void Display_Menu(int optionInput)
    {
        /*
         * 0. Quit
         * 1. InputNumbers
         * 2. DisplayNumbers
         * 3. SearchNumbers 
         * 4. DeleteNumbers
        */

        //means to store options
        Map<Integer, String> menuOptions = new HashMap<Integer, String>();

        menuOptions.put(0, "Quit");
        menuOptions.put(1, "Input Numbers");
        menuOptions.put(2, "Display Numbers");
        menuOptions.put(3, "Search Number");
        menuOptions.put(4, "Delete Numbers");
        
        if(optionInput == 0)
        {
            System.out.println("MAIN MENU");
            for(int i = 0; i < menuOptions.size(); i++)
            {
                System.out.println(i + " - " + menuOptions.get(i));
            }
        }
        else
        {
            System.out.print(menuOptions.size() - 1);
        }
    }

    public void executeCommandFromDisplayMenu(int commandOptionInput)
    {
        Map<Integer, Runnable> listOfCommands = new HashMap<>();

        listOfCommands.put(0, () -> System.out.println("Ending Program"));
        listOfCommands.put(1, () -> Input_Numbers());
        listOfCommands.put(2, () -> Display_Numbers());
        listOfCommands.put(3, () -> Search_Numbers());
        listOfCommands.put(4, () -> Delete_Numbers());

        //invoke command
        listOfCommands.get(commandOptionInput).run();
    }

    public void Input_Numbers()
    {
        //(Allows user to push integers onto the ArrayList entitled numbers)
        System.out.println("How many numbers will you input?");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();

        for(int i = 0; i < inputValue; i++)
        {
            System.out.print("Input Number " + i + " -> ");
            Integer valueToInputIntoArrayList = scanner.nextInt();
            numbers.add(valueToInputIntoArrayList);
        }

        functionLib.lineBreaker();
    }

    public void Display_Numbers()
    {
        //(Outputs the content of the ArrayList numbers)
        int sizeOfArrayList = numbers.size();
        if(sizeOfArrayList == 0)

        for(int i = 0; i < sizeOfArrayList; i++)
        {
            System.out.println("Index positon: "+ i+ " contains the element: "+ numbers.get(i));
        }

        functionLib.lineBreaker();

    }

    public void Search_Numbers()
    {
        //(Searches the numbers ArrayList and outputs the index of where it is found; it outputs a message that it was not found otherwise)

        //assign target value
        System.out.println("What value are you searching for?");
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();

        Boolean targetValueLocated = false;

        int sizeOfArrayList = numbers.size();

        found: 
        {
            for(int i = 0; i < sizeOfArrayList; i++)
            {
                if(inputValue == numbers.get(i))
                {
                    System.out.println("The value was located at index poostion: "+ i);
                    break found;
                }
            }
            targetValueLocated = true;
        }

        if(targetValueLocated)
        {
            System.out.println("The value "+ inputValue+ " was not located in the arrayList");
        }
    }

    public void Delete_Numbers()
    {
        //(deletes all integers in the ArrayList numbers)
        numbers.clear();
        System.out.println("All values deleted.");
        functionLib.lineBreaker();
    }

}
