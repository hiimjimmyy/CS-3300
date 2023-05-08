public class testing {
    public static int recursivelySumAnArray(int[] inputValue, int sizeOfArray, int counter, int total)
    {
       if(sizeOfArray > 0)
       {
          System.out.println("this is the count we're at: "+ counter);
          total += inputValue[counter];
          recursivelySumAnArray(inputValue, sizeOfArray - 1, counter + 1, total);
       }
       return total;
    }
 
    public static void main(String[] args) 
    {
      String message = "JIMMY";
      int sizeOfString = message.length();
 
      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int counter = 0;
      int sizeOfArray = numbers.length;
      int total = 0;
       
      System.out.println(recursivelySumAnArray(numbers,sizeOfArray, counter, total));
 
    //   recursiveStringPrintReverse(message, sizeOfString);
    }  
}
