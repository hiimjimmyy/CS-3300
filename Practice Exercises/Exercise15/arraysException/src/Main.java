import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {3, 4, 100, 1, 23, 10};
        Arrays.sort(arr, 0, arr.length );

        System.out.println("Successful sort:");
        for(int value: arr)
        {
            System.out.println(value);
        }

        System.out.println("method 1");
        try
        {
            Arrays.sort(arr, 2, 1);
        }
        catch(IllegalArgumentException e)
        {
            // System.out.println(e);
            e.printStackTrace();
        }

        //sorting it with different exception
        System.out.println("method 2");
        try
        {
            Arrays.sort(arr, -200, 2 );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            // System.out.println(e);
            e.printStackTrace();
        }

    }

}