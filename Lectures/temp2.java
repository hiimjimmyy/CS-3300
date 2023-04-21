package Lectures;

import java.util.*;

public class temp2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string");
        String userInputString = scanner.nextLine();
        
        System.out.println("input value to shift the string:");
        int valueToShiftString = scanner.nextInt();
        
        String secondHalf = userInputString.substring(0, valueToShiftString);
        System.out.println(secondHalf);


        String firstHalf = userInputString.substring(valueToShiftString);
        System.out.println(firstHalf);


        String concatedValues = firstHalf + secondHalf;



        char[] userInptuStringToArray = concatedValues.toCharArray();

        for(int i = 0; i < userInptuStringToArray.length; i++)
        {
            System.out.print(userInptuStringToArray[i] + " ");
        }

        
    }
}
