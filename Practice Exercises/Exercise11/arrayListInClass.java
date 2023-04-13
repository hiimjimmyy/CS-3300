package Exercise11;

import java.util.*;

public class arrayListInClass 
{

    public static void main(String[] Args)
    {
        //objects of classes
        functionLibrary functionLib = new functionLibrary();
        data newDataValue = new data();

        //scanner for user input
        Scanner scanner = new Scanner(System.in);
        

        //program start
        do
        {
            functionLib.lineBreaker();

            //display menu
            newDataValue.Display_Menu(0);

            System.out.print("Input a valid option from 0 to ");
            newDataValue.Display_Menu(1);
            System.out.println("");
            int userInput = scanner.nextInt();
            userInput = functionLib.validInputBetweenRange(userInput, 0, 4); //this is so trash please fix this when you can

            if(userInput == 0)
            {
                break;
            }

            //executes command based on obtianed user input
            newDataValue.executeCommandFromDisplayMenu(userInput);
        }
        while(true);

    }
}
