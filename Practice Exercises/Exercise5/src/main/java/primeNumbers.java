package Exercise5.src.main.java;
import java.util.*;

public class primeNumbers {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //obtain input from user
        System.out.println("Input a prime number: ");
        int input = scanner.nextInt();

        scanner.close();

        //check if prime, if it is, output all the prime values contained within that number, else output message stating value is not prime.
        System.out.println(input + " has the following prime numbers: ");
        findPrime(input);
    }

    public static ArrayList<Integer> findPrime(Integer input)
    {
        ArrayList<Integer> returnArrayOfAllPrimeValuesWithinInput = new ArrayList<Integer>();
        Integer inputValue = input;
        //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        //a prime number is a number thats only divisible by 1 or itself

        Boolean thisNumberIsAPrime = true;
        int firstPrimeNumber = 2;
        while(inputValue > firstPrimeNumber)
        {
            //decrement counter
            inputValue = inputValue - 1;

            int upperNumber = inputValue;
            int lowerNumber = firstPrimeNumber;

            for(int i = upperNumber; inputValue > firstPrimeNumber; i--)
            {
                
            }


            if(thisNumberIsAPrime)
            {
                returnArrayOfAllPrimeValuesWithinInput.add(inputValue);
            }


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


            

        }
        System.out.println(returnArrayOfAllPrimeValuesWithinInput);


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

        return null;
    }

    // public static void checkIfPrime(int inputFromMain)
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
    // }
}
