package Exercise12;

import java.util.*;


public class functionLib
{

    public int randomValueGeneratedBetween0And50()
    {
        Random randomValue = new Random();
        int randomValueBetween0And10ForReturn = randomValue.nextInt(50+1);
        return randomValueBetween0And10ForReturn;
    }
}
