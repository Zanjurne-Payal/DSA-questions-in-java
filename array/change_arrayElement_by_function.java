package array;

public class change_arrayElement_by_function {
    static void printArray(int[] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void change(int[] arr,int a){
        a = 9000;
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int a =90;
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        printArray(arr);
        System.out.println("a = "+a);
        change(arr, a);
        printArray(arr);
        System.out.println("a = "+a);
        //we see their are variable value does not change because java allow only pass by value
        // but array elemnts are change
    }
}
