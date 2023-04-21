package Exercise10;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class pizzaClass
{
    private static final Map<String, Integer> sizeOfPizzaToPrice = new HashMap<>();
    static 
    {
        //i dont like how i did this
        sizeOfPizzaToPrice.put("Small", 10);
        sizeOfPizzaToPrice.put("Medium", 12);
        sizeOfPizzaToPrice.put("Large", 14);
    }

    public void getMappingData()
    {
        System.out.println(sizeOfPizzaToPrice);
    }

}

