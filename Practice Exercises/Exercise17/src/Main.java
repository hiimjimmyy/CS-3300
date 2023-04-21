import java.util.*;

public class Main 
{

    public static void RecursivlyPrintingStirngInReverse(String inputString, int sizeOfInputString)
    {
        if(sizeOfInputString > 0)
        {
            System.out.println(inputString.charAt(sizeOfInputString - 1));
            RecursivlyPrintingStirngInReverse(inputString, sizeOfInputString - 1);
        }
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string");
        String inputValue = scanner.nextLine();
        int sizeOfInputString = inputValue.length();
        int tempValue = sizeOfInputString;
        RecursivlyPrintingStirngInReverse(inputValue, tempValue);
    }
}