package Lectures;

import java.util.Scanner; //this will allow us to use scanners


public class scannerdemo {

    // public static Boolean someFunction()
    // {
    //     Scanner scanner = new Scanner(System.in);
    //         System.out.println("Input a chracter");
    //         char usersChoiceToRepeatProgram = scanner.next().charAt(0); 
    //         scanner.close();
    //         System.out.println(usersChoiceToRepeatProgram);

    //         if(usersChoiceToRepeatProgram == 'Y')
    //         {
    //             return true;
    //         }

    //         return false;
    // }
    
    public static void main(String[] args)
    {
        Boolean repeat = false;

        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a chracter");

            char usersChoiceToRepeatProgram = scanner.next().charAt(0); 
            // scanner.close();
            System.out.println(usersChoiceToRepeatProgram);

            if(usersChoiceToRepeatProgram == 'Y')
            {
                repeat = true;
            }
        }
        while(!repeat);





        
        // try (Scanner keyboard = new Scanner(System.in)) 
        // {
        //     System.out.println("Input the value of x, and y, and then this program will output the product.\n");

        //     System.out.println("x:");
        //     int x = keyboard.nextInt();

        //     System.out.println("y:");
        //     int y = keyboard.nextInt();

        //     int product = x * y;
        //     System.out.println("the product of "+ x + " and "+ y +" is: "+ product);
        // }
        
    }   
}
