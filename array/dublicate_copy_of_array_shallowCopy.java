package array;
import java.util.Scanner;
public class dublicate_copy_of_array_shallowCopy {
    static void printArray(int[] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 53;
        arr[3] = 524;
        arr[4] = 115;
        System.out.println("origional array before changing");
        printArray(arr);
        int[] brr = arr;
        System.out.println("dublicate array before changing");
        printArray(brr);

        brr[0] = 0;
        brr[1] = 0;
        brr[2] = 0;

        System.out.println("origional array after changing");
        printArray(arr);
        System.out.println("dublicate array after changing");
        printArray(brr);

        //we can see if we change the value of one array the values of another array will change automatically
        //because when we create an array it create space a stack but values are store on heep
        //the variable is getting reference  it does not allocated to new memorey from heap so actualy we create two array but only names are different
        //this is also called as shallow copy of array
    }
}
