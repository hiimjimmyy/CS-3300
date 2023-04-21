package Exercise10;

import java.util.*;
import javax.swing.*;

public class mainProgram
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        pizzaClass pizzaClassObj = new pizzaClass();
        functionLib functionLibObj = new functionLib();


        //Get Input using a Graphical User Interface
        /*
        * prompt user to input how many pizza they want
        * 
        * prompt user to select what size pizza they want
        * 
        * promt user to input how many cheese toppings they want
        * 
        * prompt user to inptu how many ham toppings they want
        * 
        * prompt user to input how many pepperoni toppings they want
        * 
        *  if the user selected an input x > 1; we prompt another 
        *  
        * Display the results in a JOptionPane message:
        * size: (size), chessing toppings: (#amount), pepperoni    toppings: (#size), ham toppings: (#size). cost: (amount)
        */


        //unit testing [start]
        pizzaClassObj.getMappingData();
        functionLibObj.printTestMessage();




        // String inputForTotalAmountOfPizzas = JOptionPane.showInputDialog("How many Pizzas do you want?");



        //Display the total cost results from all the pizza in a JOptionPane



    }
}