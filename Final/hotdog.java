public class hotdog
{
    private static int totalHotdogsSold;
    private int hotdogsSold;

    hotdog()
    {
        hotdogsSold = 0;
    }

    public void increment()
    {
        totalHotdogsSold += 1;
        hotdogsSold += 1;
    
    }

    public void chechTotal()
    {
        System.out.println(totalHotdogsSold);
    }
}
