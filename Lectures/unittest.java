package Lectures;
import java.util.*;

import javax.xml.stream.events.StartDocument;


public class unittest {

    public static void testFunction(ArrayList<Integer> inputArrayList)
    {
        inputArrayList.add(100000);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> data1 = new ArrayList<>();

        data1.add(1);
        data1.add(2);
        data1.add(3);

        System.out.println("Array list before function");
        System.out.println(data1);

        System.out.println("Array list after function");
        testFunction(data1);
        System.out.println(data1);


    }
}
 
