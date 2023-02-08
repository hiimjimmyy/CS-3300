package Exercise5;
import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //obtain input from user
        System.out.println("Input a prime number: ");
        int input = scanner.nextInt();

        scanner.close();
        System.out.print(input + " ");

        //check if prime, if it is, output all the prime values contained within that number, else output message stating value is not prime.
        System.out.println(input + " has the following prime numbers: ");
        checkIfPrime(input);

    }

    //FUNCTION: checks if input value is a prime number
    public static void checkIfPrime(int inputFromMain)
    {
        if(inputFromMain == 1)
        {
            System.out.println("Nothing"  +inputFromMain + " is not a prime number" );
        }
        else
        {
            // String inputToString = Integer.toString(inputFromMain);
            // String lastValueFromString = inputToString.substring(inputToString.length() - 1);
            // int lastValueFromStringToInt = Integer.parseInt(lastValueFromString);

            // if(lastValueFromStringToInt == 0 || lastValueFromStringToInt == 2 || lastValueFromStringToInt == 4 || lastValueFromStringToInt == 6 || lastValueFromStringToInt == 8)
            // {
                
            // }
            

        }
    }
}
