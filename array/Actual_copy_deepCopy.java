package array;

import java.util.Arrays;
import java.util.Scanner;
//1. using cloan()
//2. using Array class and copyOf() method (Array.copyOf())
//3. using array class and copyOfRange(Array, 2,4)
public class Actual_copy_deepCopy {
    private static Object Arrays;

    static void printArray(int[] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 450;
        arr[1] = 943;
        arr[2] = 94;
        arr[3] = 340;
        arr[4] = 30;

        //method 1
        int[] arr2 = arr.clone(); // it is deep copy

        //method 2 - not working
        //int[] arr2 = Arrays.copyOf(arr,6);
        //method 3 - not working
        //int[] arr2 = Arrays.copyOfRange(arr , 0 , 3);
        System.out.println("origional array :");
        printArray(arr);
        System.out.println("copied array :");
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;
        arr2[2] = 0;
        arr2[3] = 0;

        System.out.println("origional array after changing:");
        printArray(arr);
        System.out.println("copied array after changing:");
        printArray(arr2);
    }
}
