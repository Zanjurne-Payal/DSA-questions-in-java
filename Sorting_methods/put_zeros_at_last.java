package Sorting_methods;
// use concept of bubble sort
public class put_zeros_at_last {
    static void sort(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            boolean flag = false;
            for(int j = 0 ; j < arr.length-1-i ; j++)
            {
                if(arr[j] == 0 && arr[j+1] != 0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)return;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0 , 5 , 0 , 3 , 4 , 2};

        System.out.println("Array before sorting");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+"     ");
        }

        sort(arr);

        System.out.println("\nArray After sorting");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+"     ");
        }
    }
}
