//try catch practice exercise

package Exercise2;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class trycatchpart1 {
    public static void main(String[] args)
    {
        PromptInputPaneMessagesAndReturnResults();
        System.exit(0);
    }

    public static void PromptInputPaneMessagesAndReturnResults()
    {
        String inputOne, inputTwo;
        Boolean allowSecondInput = false;
        Boolean allowComparisonBoolean = false;
        Integer inputOneInteger, inputTwoInteger = null;

        //obtain the first input
        inputOne = JOptionPane.showInputDialog("Input the first number: ");
        
        //if first input was a valid integer input, we ask for the second input, else we return an error
        inputOneInteger = ConvertInputToInt(inputOne);

        if(inputOneInteger == null)
        {
            allowSecondInput = false;
        }
        else
        {
            allowSecondInput = true;
        }

        //obtain the second input
        if(allowSecondInput == true)
        {
            inputTwo = JOptionPane.showInputDialog("Input the second number: ");

            inputTwoInteger = ConvertInputToInt(inputTwo);

            if(inputTwoInteger == null)
            {
                allowComparisonBoolean = false;
            }
            else
            {
                allowComparisonBoolean = true;
            }
        }

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
        else if(inputTwo > inputOne)
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
