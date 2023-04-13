package Lectures;

import java.util.*;

import Exercise3.lotterysimulator;

public class arraydemo {
    public static void main(String[] Args)
    {
        //intialize array:
        // final int size = 10;
        // int[] nameOfArray;
        // nameOfArray = new int[size];

        // //populate array:
        // // for(int i = 0; i < size; i++)
        // // {
        // //     nameOfArray[i] = i;
        // // }

        // // //display array content:
        // // for(int j = 0; j < size; j++)
        // // {
        // //     System.out.println("the index position is: " + j + "the contents are: " + nameOfArray[j]);
        // // }


        // System.out.println("2D Array: ");

        // int[][] twoDArray;
        // twoDArray = new int [5][5];
        
        // int value = 0;


        // //populate 2d array:
        // for(int i = 0; i < 5; i++)
        // {
        //     for(int j = 0; j < 5; j++)
        //     {
        //         twoDArray[i][j] = value;
        //         value++;

        //     }
        // }

        // //display content of the a<rray:
        // for(int row = 0; row < 5; row++)
        // {
        //     for(int col = 0; col < 5; col++)
        //     {
        //         System.out.print(twoDArray[row][col] + " ");
        //     }
        //     System.out.println(" ");
        // }

        // int a = 100;
        // int b = 200;

        // System.out.println("the content of a: " + a);
        // System.out.println("the content of a: " + b);

        // System.out.println("AFTER SWAP");
        // swap(a, a=b);
        // System.out.println("the content of a: " + a);
        // System.out.println("the content of a: " + b);
            
            
        // int[] arr;
        // arr = new int[10];

        // Random someRandomValue =new Random();

        // for(int i = 0; i < arr.length; i++)
        // {
        //     arr[i] = someRandomValue.nextInt(100);
        // }

        // System.out.println("The following is the content of the array:");

        // for(int j = 0; j < arr.length; j++)
        // {
        //     System.out.println("At index: " + 1+ "contains: "+arr[j]);
        // }

        // System.out.println("now we will sort the array: ");
        
        // int[] sortedArr;
        // sortedArr = new int[10];
        // sortedArr = bubblesortArray(arr);

        // for(int k = 0; k < sortedArr.length; k++)
        // {
        //     System.out.println("At index: " + k+ " contains: "+sortedArr[k]);
        // }
        

        // Scanner scannerObject = new Scanner(System.in);
        // System.out.println("what value are you trying to find in the array?: ");
        // int value = scannerObject.nextInt();

        // System.out.println("we are passing this value to our search function: ");
        // binarySearch(sortedArr, value);


        ArrayList<Integer> data1 = new ArrayList<>();

       


    }

    public static void binarySearch(int[] arr, int targetValue)
    {
        //this is linear search
        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(arr[i] == targetValue)
        //     {
        //         System.out.println("value found at position: " + i);
        //     }
        //     else
        //     {
        //         // System.out.println("we've iterated thorught the entire ihnput array, and it did not containt he value");
        //     }
        // }
    

        // int conterForLoop;
        int right = arr.length;
        int left = 0;
        int middle = right/2;
        
        // conterForLoop = right;
        // for(int i = 0; i < conterForLoop; i++)
        // {
        //     if(middle == targetValue)
        //     {
        //         System.out.println("Value found at postion: " + arr[i]);
        //     }
        //     if(targetValue > middle)
        //     {
                
        //     }
        // }

        while(left <= right)
        {
            middle = (left+right)/2;
            if(arr[middle] == targetValue)
            {
                System.out.println("the value: " + arr[middle] +" is contained within the array");

            }
            if(targetValue < arr[middle])
            {
                right = middle -1;
            }
            else
            {
                left = middle +1;
            }
        }

    }



    public static int[] bubblesortArray(int[]inputArray)
    {
        //initalized array
        int sizeOfArr = inputArray.length;
        // int[] returnArray = new int[sizeOfArr];
        
        for(int i = 0; i < sizeOfArr; i++)
        {
            for(int j = i + 1; j < sizeOfArr; j++)
            {
                if(inputArray[i] > inputArray[j])
                {
                    //perform swap
                    int temp;
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }



        return inputArray;
    }

    
}
