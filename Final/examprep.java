import java.util.*;
import java.io.*;



/*
 * Write a recursive method that accepts a string object as its argument and prints the string in reverse order to the Console. Demonstrate that the method works.
Note: The method does not need to return any values. It just needs to output the string in reverse order to the console screen.
*/
public class examprep
{

   public static void recursiveStringPrintReverse(String inputString, int sizeOfString)
   {
      if(sizeOfString > 0)
      {
         System.out.println(inputString.charAt(sizeOfString - 1));
         recursiveStringPrintReverse(inputString, sizeOfString - 1);
      }
      
   }
   public static void foo(String str){
      if((str==null)||(str.length()<=1)){
         System.out.println(str);
      }else{
         System.out.print(str.charAt(str.length()-1));
         foo(str.substring(0,str.length()-1));
      }
   }


   public static int recursivelySumAnArray(int[] inputValue, int sizeOfArray, int counter, int total)
   {
      if(sizeOfArray == 0)
      {
         return total;
      }
      if(sizeOfArray > 0)
      {
         total += inputValue[counter];
      }
      return recursivelySumAnArray(inputValue, sizeOfArray - 1, counter + 1, total);
   }

   public static void main(String[] args) 
   {
     String message = "JIMMY";
     int sizeOfString = message.length();

     int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     int counter = 0;
     int sizeOfArray = numbers.length;
     int total = 0;
      
   //   System.out.println(recursivelySumAnArray(numbers ,sizeOfArray, counter, total));

      foo(message);
   //   recursiveStringPrintReverse(message, sizeOfString);
   } 
}
