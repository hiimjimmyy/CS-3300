package Exercise11;

import java.util.*;

public class functionLibrary
{
    public void lineBreaker()
    {
        System.out.println("*********************************");
    }

    public int validInputBetweenRange(int inputValue, int minRange, int maxRange)
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
            if(inputValue > maxRange || inputValue < minRange)
            {
                System.out.println("Please enter a valid integer from "+ minRange+ " to "+ maxRange);
                int userInput = scanner.nextInt();
                inputValue = userInput;
            }
            else
            {
                return inputValue;
            }
        }
        while(true);
    }

}
