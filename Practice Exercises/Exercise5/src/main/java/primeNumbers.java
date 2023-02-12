package Exercise5.src.main.java;
import java.util.*;

public class primeNumbers {

    public static void main(String[] args)
    {
        Scanner usersChoice = new Scanner(System.in);
        Integer output = null;
        Boolean quitProgram = true;
        
        //loop to repeat program, until the user opts to quit
        do
        {
            //obtain user input
            output = askUserToInputANumberAndReturnThatValue();

            // //finds all the prime numbers from 0 to the input value
            ArrayList<Integer> listOfAllPrimeNumbers = findPrimeNumbersWithinRangeOfZeroToInputValueAndReturnInArrayList(output);
            //we will pass this integer list to a functon that will process display
            System.out.println(listOfAllPrimeNumbers);

            //check if user wants to repeat the program
            try
            {
                System.out.println("Do you want to quit?");
                char usersChoiceToRepeatProgram = usersChoice.next().charAt(0);

                if(usersChoiceToRepeatProgram == 'y')
                {
                    quitProgram = false;
                }
            }
            catch(Exception e)
            {
                quitProgram = false;
            }

            usersChoice.close();
        }
        while(quitProgram);

    }

    public static Integer askUserToInputANumberAndReturnThatValue()
    {
        //creating an object of scanner to obtain input from user
        Scanner scanner = new Scanner(System.in);
        
        //obtain input from user in console
        System.out.println("Input a number: ");
        int input = scanner.nextInt();

        //close scanner to avoid mEmOry LeAk
        scanner.close();
        
        //return user input value
        return input;
    }

    public static ArrayList<Integer> findPrimeNumbersWithinRangeOfZeroToInputValueAndReturnInArrayList(Integer input)
    {
        ArrayList<Integer> returnArrayOfAllPrimeValuesWithinInput = new ArrayList<Integer>();
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        //a prime number is a number thats only divisible by 1 or itself
        int firstPrimeNumber = 2;

        for(int i = 0; i < input; i++)
        {
            if(i > 1)
            {
                found :
                {
                    for(int j = firstPrimeNumber; j < i; j++)
                    {
                        if (i % j == 0)
                        {
                            break found;
                        }
                    }
                    returnArrayOfAllPrimeValuesWithinInput.add(i);
                }
            }
        }
        // System.out.println(returnArrayOfAllPrimeValuesWithinInput);
        
        
        // Boolean thisNumberIsAPrime = true;

        // while(inputValue > firstPrimeNumber)
        // {
        //     //decrement counter
        //     inputValue = inputValue - 1;

        //     int upperNumber = inputValue;
        //     int lowerNumber = firstPrimeNumber;

        //     for(int i = upperNumber; inputValue > firstPrimeNumber; i--)
        //     {
                
        //     }


            // if(thisNumberIsAPrime)
            // {
            //     returnArrayOfAllPrimeValuesWithinInput.add(inputValue);
            // }


            // for(int j = inputValue - 1; (j+1) < inputValue; j--)
            // {
            //     try
            //     {
            //         if(inputValue % j == 0)
            //         {
            //             thisNumberIsAPrime = false;
            //         }
            //     }
            //     catch (Exception e)
            //     {
            //         break;
            //     }
            // }


            // if(inputValue % 2 == 0)
            // {
            //     inputValue = inputValue - 1;
            // }
            // else
            // {
            //     if(inputValue % i == 0)
            //     {
            //         inputValue = inputValue - 1;
            //     }
            //     else
            //     {
            //         returnArrayOfAllPrimeValuesWithinInput.add(inputValue);
            //     }
            // }

        // }

        // int counter = 2;
        // while(counter <= input)
        // {
        //     if(inputValue % 2 == 0)
        //     {
        //         counter = counter + 1;
        //         inputValue = inputValue - 1;
        //     }
        //     else
        //     {
        //         returnArrayOfAllPrimeValuesWithinInput.add(counter);
        //     }
        // }

            // {
        //     if(inputFromMain == 1)
        //     {
        //         System.out.println("Nothing"  +inputFromMain + " is not a prime number" );
        //     }
        //     else
        //     {
        //         // String inputToString = Integer.toString(inputFromMain);
        //         // String lastValueFromString = inputToString.substring(inputToString.length() - 1);
        //         // int lastValueFromStringToInt = Integer.parseInt(lastValueFromString);

        //         // if(lastValueFromStringToInt == 0 || lastValueFromStringToInt == 2 || lastValueFromStringToInt == 4 || lastValueFromStringToInt == 6 || lastValueFromStringToInt == 8)
        //         // {
                
        //         // }
        //     }

        return returnArrayOfAllPrimeValuesWithinInput;
    }
    
}