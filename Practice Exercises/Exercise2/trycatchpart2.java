package Exercise2;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class trycatchpart2 {
    public static void main(String[] args)
    {
        //call promptpane and return results
        PromptInputPaneMessagesAndReturnResults();
        System.exit(0);
    }

    public static void PromptInputPaneMessagesAndReturnResults()
    {
        String inputOne, inputTwo;
        Boolean allowSecondInput = false;
        Boolean allowComparisonBoolean = false;
        Boolean allowPassThrough = false; 
        Integer inputOneInteger, inputTwoInteger = null;

        //obtain the first input
        inputOne = JOptionPane.showInputDialog("Input the first number: ");

        //if first input was a valid integer input, we ask for the second input, else we return an error
        inputOneInteger = ConvertInputToInt(inputOne);

        //logic for first input
        if(inputOneInteger == null)
        {
            do
            {
                inputOne = JOptionPane.showInputDialog("Input the first number: ");
                inputOneInteger = ConvertInputToInt(inputOne);
                if(inputOneInteger != null)
                {
                    allowPassThrough = true;
                    allowSecondInput = true;
                }
            }
            while(!allowPassThrough);
        }
        else
        {
            allowSecondInput = true;
        }

        //reset the boolean for input validation
        allowPassThrough = false;

        //obtain the second input
        if(allowSecondInput == true)
        {
            inputTwo = JOptionPane.showInputDialog("Input the second number: ");
            inputTwoInteger = ConvertInputToInt(inputTwo);

            if(inputTwoInteger == null)
            {
                do
                {
                    inputTwo = JOptionPane.showInputDialog("Input the second number: ");
                    inputTwoInteger = ConvertInputToInt(inputTwo);
                    if(inputTwoInteger != null)
                    {
                        allowPassThrough = true;
                        allowComparisonBoolean = true;
                    }
                }
                while(!allowPassThrough);
            }
            else
            {
                allowComparisonBoolean = true;
            }
        }

        //pass both integer inputs onto a function that will compare, and return results
        if(allowComparisonBoolean)
        {
            CompareBothInputs(inputOneInteger, inputTwoInteger);
        }

    }

    public static void CompareBothInputs(int inputOne, int inputTwo)
    {
        if(inputOne == inputTwo)
        {
            JFrame ReturnMessage = new JFrame();
            JOptionPane.showMessageDialog(ReturnMessage, inputOne + " = " + inputTwo, "Results", JOptionPane.PLAIN_MESSAGE);
        }
        else if(inputOne > inputTwo)
        {
            PromptReturnMessage(inputOne, inputTwo);
        }
        else if(inputOne < inputTwo)
        {
            PromptReturnMessage(inputTwo, inputOne);
        }
    }

    public static void PromptReturnMessage(int greaterValue, int smallerValue)
    {
        JFrame ReturnMessage = new JFrame();
        JOptionPane.showMessageDialog(ReturnMessage, greaterValue + " is greater than " + smallerValue, "Results", JOptionPane.PLAIN_MESSAGE);
    }

    public static Integer ConvertInputToInt(String input)
    {
        Integer returnConversionValue;

        try
        {
            returnConversionValue = Integer.parseInt(input);
        } catch (Exception e)
        {
            PromptErrorMessage(input);
            return null;
        }

        return returnConversionValue;
    }

    public static void PromptErrorMessage(String input)
    {
        JFrame ErrorMessage = new JFrame();
        JOptionPane.showMessageDialog(ErrorMessage, input + " is not a valid number", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
