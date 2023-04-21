package Exercise12;

public class mainDriver
{
    
    public static void main(String[] args)
    {
        System.out.println("\n\tHot Dog Stand Simulation!\n"); //test if program works

        //create 3 objects of hotdogstand
        HotDogStand stand1 = new HotDogStand();
        HotDogStand stand2 = new HotDogStand();
        HotDogStand stand3 = new HotDogStand();

        //this will display the unique IDs of the hotdogstand
        System.out.println("stand 1's ID is: " +stand1.getID());
        System.out.println("stand 2's ID is: " +stand2.getID());
        System.out.println("stand 3's ID is: " +stand3.getID());

        //simulate hotdogs sold
        stand1.incrementTotalHotDogsSoldARandomAmountOfTImes();
        stand2.incrementTotalHotDogsSoldARandomAmountOfTImes();
        stand3.incrementTotalHotDogsSoldARandomAmountOfTImes();

        //process, display, and format
        System.out.println("\nstand 1"+ " with the ID: "+stand1.getID()+ " sold "+stand1.getAmountOfHotDogsSold()+ " hotdogs.");
        System.out.println("stand 2"+ " with the ID: " +stand2.getID()+ " sold "+stand2.getAmountOfHotDogsSold()+ " hotdogs.");
        System.out.println("stand 3"+ " with the ID: "+stand3.getID()+ " sold "+stand3.getAmountOfHotDogsSold()+ " hotdogs.");
        System.out.println("\nThe total amount of hotdogs sold are: "+ stand3.getTotalHotDogsSoldAmongAllStands()+ "\n");

    }
}
