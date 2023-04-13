package Exercise6;

import javax.swing.*;

public class stringShift {
    

    public static void main(String[] args)
    {
        Boolean quitProgram = false;
        do
        {
            //Prompt JOptionPane to obtain input for a string
            String outputFromFunctionThatObtainsStringInput = promptInputPaneMessagesAndObtainUserInputOfAString();

            //obtain input for the number of shifts
            //check if input is a valid integer if it is, allow to go to next step, if not repeat step
            Integer outputFromFunctionThatObtainsIntegerInput = promptInputPaneMessagesAndObtainUserInputOfAInteger(outputFromFunctionThatObtainsStringInput);

            //pass string to function that will split the string based on the index position of(outputFromFunctionThatObtainsIntegerInput), and return new string
            String newStringWithPositionalChanges;
            newStringWithPositionalChanges = performStringSplitOnInputAndReturnNewString(outputFromFunctionThatObtainsStringInput, outputFromFunctionThatObtainsIntegerInput);

            //process display & format in JOPtion pane
            processDisplayAndFormat(outputFromFunctionThatObtainsStringInput, newStringWithPositionalChanges, outputFromFunctionThatObtainsIntegerInput);

            //Prompt antother JOPtion pane to ask if user wants to quit, (y for yes)
            String userChoiceToContinueProgram;
            userChoiceToContinueProgram = JOptionPane.showInputDialog(null, "Do you want to quit? input 'Y' to quit.");
            char userChoice= userChoiceToContinueProgram.charAt(0);
            if(userChoice == 'Y')
            {
                quitProgram = true;
            }
        }
        while(!quitProgram);
    }

    public static String promptInputPaneMessagesAndObtainUserInputOfAString()
    {
        String input;
        input = JOptionPane.showInputDialog("Enter a string");

        return input;
    }

    public static Integer promptInputPaneMessagesAndObtainUserInputOfAInteger(String inputString)
    {
        String input;
        Integer stringInputConvertedToInteger;
        
        do
        {
            try
            {
                input = JOptionPane.showInputDialog("input the number of shifts:");
                stringInputConvertedToInteger = Integer.parseInt(input);
                
                if(stringInputConvertedToInteger != null)
                {
                    if(stringInputConvertedToInteger < inputString.length())
                    {
                        return stringInputConvertedToInteger;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your input is greater than the size of the string. Please try again", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(Exception e)
            {
                // System.out.println("Input from promptInputPaneMessagesAndObtainUserInputOfAInteger() is invalid: " + e);
                //do nothing
            }
        }
        while(true);

    }

    public static String performStringSplitOnInputAndReturnNewString(String input, Integer splitAtThisIndexPosition)
    {
        String firstHalf;
        firstHalf =  input.substring(0, splitAtThisIndexPosition);

        String secondHalf;
        secondHalf = input.substring(splitAtThisIndexPosition);

        String concatenatedSecondAndFirstHalfOfString = secondHalf+firstHalf;

        return concatenatedSecondAndFirstHalfOfString;
    }

    public static void processDisplayAndFormat(String originalString, String shiftedString, Integer numbersOfShift)
    {
        String line1 = "Original String = "+originalString+ "\n";
        String line2 = "Shifted String = " +shiftedString+ "\n";
        String line3 = "Number of Shifts = "+numbersOfShift;
        
        String message = line1 + line2+ line3;

        JOptionPane.showMessageDialog(null, message, "Shifted String", JOptionPane.PLAIN_MESSAGE);
    }
    
}

