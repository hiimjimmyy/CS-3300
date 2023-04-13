package Lectures;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */


}

    public class testing {


    public static int countPairs(List<Integer> numbers, int k) {
        int amountOfPairs = 0;
        //a + k = b within (a,b)
        
        for(int i = 0; i < numbers.size(); i++)
        {
            for(int j = i + 1; i < numbers.size(); j++)
            {
                if(numbers.get(i) + k == numbers.get(j))
                {
                    amountOfPairs = amountOfPairs + 1;
                }
            }
        }
        
        return amountOfPairs;
    }
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        int k = 2;
        int total;
        total = countPairs(list, k);

        System.out.println(total);


    }
}

