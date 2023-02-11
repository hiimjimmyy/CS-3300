package Exercise3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Random; //this will allows us to generate random numbers
import java.util.ArrayList; //this will allow us to return our users' input from the function call: promptInputPaneMessagesAndObtainInput(), into an array list, and then we can pass that infomation onto our lotto simulator

public class lotterysimulator {

    //global variable for the restrictions in range of input
    public static int lowestValue = 0;
    public static int highestValue = 99;
    public static void main(String[] args) 
    {
        //created an ArrayList of integers for the return value of promptInputPaneMessagesAndObtainUserInput()
        ArrayList<Integer> returnValueFromFunctionPromptingUserToInputIntegers = new ArrayList<Integer>();

        //calling pane to obtain user input, and return their input in a form of an arraylist
        returnValueFromFunctionPromptingUserToInputIntegers = promptInputPaneMessagesAndObtainUserInput(); 
        
        //passing the inputed values, in a form of an arrayList, to a function that will generate random lotto numbers until we have a match, and return the total amount of tries it took before those numbers match.
        int amountOfTrysTillInputListMatch = callLottoGenerator(returnValueFromFunctionPromptingUserToInputIntegers);

        //output the information onto the console (we can refactor to output it to a JOPtionPane if desired)
        System.out.println("It took " + amountOfTrysTillInputListMatch + " tries to generate these threee numbers: " + returnValueFromFunctionPromptingUserToInputIntegers.toString());

        System.exit(0);
    }

    public static int callLottoGenerator(ArrayList<Integer> inputList)
    {
        System.out.println("Your numbers are: "+inputList.toString()); ///unit test to show we were able to accept array argument
        int amountOfTrysTillInputListMatch = 0; //counter for return
        int firstWinningNumbersFromGenerator = randomGeneratedNumber();
        int secondWinningNumbersFromGenerator = randomGeneratedNumber();
        int thirdWinningNumbersFromGenerator = randomGeneratedNumber();
        
        
        //[enable for unit testing]
        // firstWinningNumbersFromGenerator = 1;
        // secondWinningNumbersFromGenerator = 2;
        // thirdWinningNumbersFromGenerator = 3;


        //
        int firstUserInputedNumber = inputList.get(0);
        int SecondUserInputedNumber = inputList.get(1);
        int ThirdUserInputedNumber = inputList.get(2);

        //boolean function to break the do while loop
        Boolean lottoMatched = false;
        do
        {
            amountOfTrysTillInputListMatch += 1;
            if(firstUserInputedNumber == firstWinningNumbersFromGenerator)
            {
                // System.out.println("we are on the second loop");
                if(SecondUserInputedNumber == secondWinningNumbersFromGenerator)
                {
                    if(thirdWinningNumbersFromGenerator == ThirdUserInputedNumber)
                    {
                        lottoMatched = true;
                        return amountOfTrysTillInputListMatch;
                    }
                }
            }

            // System.out.println("second loop never initated");
            //if the numbers do not match we generate new numbers
            firstWinningNumbersFromGenerator = randomGeneratedNumber();
            secondWinningNumbersFromGenerator = randomGeneratedNumber();
            thirdWinningNumbersFromGenerator = randomGeneratedNumber();
        }
        while(!lottoMatched);

        return 0;
    }

    public static int randomGeneratedNumber()
    {
        int randomGeneratedNumberReturnValue;
        Random randomlyGeneratedValue = new Random();

        randomGeneratedNumberReturnValue = randomlyGeneratedValue.nextInt(highestValue+1); 
        
        return randomGeneratedNumberReturnValue;
    }

    public static ArrayList<Integer> promptInputPaneMessagesAndObtainUserInput()
    {
        //input variables from pane
        String num1, num2, num3;
        //input variables conversion from string to integer, we assign null to give it a temporal value
        Integer num1Integer = null;
        Integer num2Integer = null;
        Integer num3Integer = null; 
        
        //boolean variable to allow pass through
        Boolean allowSecondInput = false;
        Boolean allowThirdInput = false;
        Boolean allowPassThrough = false;

        //obtain first input
        do
        {
            num1 = JOptionPane.showInputDialog("What do you think the 1st lottery number will be?");
            num1Integer = convertInputToInt(num1);

            while(!allowPassThrough)
            {
                if(isValidNumber(num1Integer) == false)
                {
                    promptErrorMessage(num1);
                    num1 = JOptionPane.showInputDialog("What do you think the 1st lottery number will be?");
                    num1Integer = convertInputToInt(num1);
                }
                else
                {
                    allowPassThrough = true;
                }
            }
            
            if(num1Integer == null)
            {
                allowSecondInput = false;
            }
            else
            {
                allowSecondInput = true;
            }
        }
        while(!allowSecondInput);

        //resetting the boolean for the second input
        allowPassThrough = false;

        //obtain second input
        if(allowSecondInput)
        {
            do
            {
                num2 = JOptionPane.showInputDialog("What do you think the 2nd lottery number will be?");
                num2Integer = convertInputToInt(num2);
                
                while(!allowPassThrough)
                {
                    if(isValidNumber(num2Integer) == false)
                    {
                        promptErrorMessage(num2);
                        num2 = JOptionPane.showInputDialog("What do you think the 2nd lottery number will be?");
                        num2Integer = convertInputToInt(num2);
                    }
                    else
                    {
                        allowPassThrough = true;
                    }
                }

                if(num2Integer == null)
                {
                    allowThirdInput = false;
                }
                else
                {
                    allowThirdInput = true;
                }
            }
            while(!allowThirdInput);
        }

        allowPassThrough = false; //resetting the booleaning for the third/final input
        //obtain third, and final input
        if(allowThirdInput)
        {
            do
            {
                num3 = JOptionPane.showInputDialog("What do you think the 3rd lottery number will be?");
                num3Integer = convertInputToInt(num3);
    
                while(!allowPassThrough)
                {
                    if(isValidNumber(num3Integer) == false)
                    {
                        promptErrorMessage(num3);
                        num3 = JOptionPane.showInputDialog("What do you think the 3rd lottery number will be?");
                        num3Integer = convertInputToInt(num3);
                    }
                    else
                    {
                        allowPassThrough = true;
                    }
                }

                if(num3Integer == null)
                {
                    allowThirdInput = false;
                }
                else
                {
                    allowThirdInput = true;
                    allowPassThrough = true;
                }
            }
            while(!allowThirdInput);
        }

        //creating the array list, of integesrs and returning it to main.
        ArrayList<Integer> userDefineValues = new ArrayList<Integer>();
        if(allowPassThrough)
        {
            userDefineValues.add(num1Integer);
            userDefineValues.add(num2Integer);
            userDefineValues.add(num3Integer);
        }

        return userDefineValues;
    }

    public static Integer convertInputToInt(String input)
    {
        Integer returnConversionValue;

        try
        {
            returnConversionValue = Integer.parseInt(input);
        } catch (Exception e)
        {
            // promptErrorMessage(input);
            return null;
        }

        return returnConversionValue;
    }

    public static boolean isValidNumber(Integer input)
    {
        if(input == null)
        {
            return false;
        }
        else if (input <= highestValue & input >= lowestValue)
        {
            return true;
        } 
        return false;
    }

    public static void promptErrorMessage(String input)
    {
        JFrame ErrorMessage = new JFrame();
        JOptionPane.showMessageDialog(ErrorMessage, input + " is not a valid integer\nEnter a number in range " +"["+lowestValue+","+highestValue+"]", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
