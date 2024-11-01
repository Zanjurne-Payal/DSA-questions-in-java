package Sorting_methods;

public class sort_lexicografically {
    static void Sort(String[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_idx = i;
            for(int j = i ; j < n ; j++)
            {
                if(arr[j].compareTo(arr[min_idx]) < 0)
                {
                    min_idx = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"Payal","Shubham","Akshay","Sudhir","Rutuja","Pandurang","Manisha","Adika","Kalpana","Sanjay"};

        System.out.println("Array before sorting");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+"     ");
        }

        Sort(arr);

        System.out.println("\nArray After sorting");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+"     ");
        }
    }
}
