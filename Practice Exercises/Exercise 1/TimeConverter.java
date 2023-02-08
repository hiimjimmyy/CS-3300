import javax.swing.JOptionPane;
import javax.swing.JFrame;


class TimeConverterGUI
{
    
    //global variables for conversion
    public static final int MinutesInAnHour = 60; 

    public static void main(String [] args)
    {
        // System.out.println("Hello World!");
        final int MinimumMinuteValue = 60;
        
        int ReturnValueFromPrompt = PromtPaneMessage(MinimumMinuteValue);
        ConvertInputIntToHours(ReturnValueFromPrompt);

        // System.out.println("this was the value from the prompt: " + ReturnValueFromPrompt);
    }
    
    public static int PromtPaneMessage(int MinimumMinuteValue)
    {
        String message;
        message = JOptionPane.showInputDialog("Input a number of minutes greater than 60:");

        int OutputValue = Integer.parseInt(message);

        while(OutputValue <= MinimumMinuteValue)
        {
            System.out.println("Value is not greater than 60, please try again");
            //there's a bug here; after the inital rejection, it will keep prompting the dialog box
            message = JOptionPane.showInputDialog("Input a number of minutes greater than 60:");
        }
        return OutputValue;
    }

    public static void ConvertInputIntToHours(int inputValueFromPrompt)
    {
        int hours;
        int minutes;
        
        // hours = (TimeConverterGUI.MinutesInAnHour%inputValueFromPrompt)/TimeConverterGUI.MinutesInAnHour;
        minutes = inputValueFromPrompt%TimeConverterGUI.MinutesInAnHour;
        hours = (inputValueFromPrompt - minutes)/TimeConverterGUI.MinutesInAnHour;


        // System.out.println("this is the amount of hours: " + hours);
        // System.out.println("this is the amount of minutes: " + minutes);

        //create return dialog box
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "This is equivalent to " + hours + " hours and " + minutes + " minutes", "Results", JOptionPane.PLAIN_MESSAGE);
    }
}