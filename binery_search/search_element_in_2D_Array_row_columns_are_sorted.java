package binery_search;
import java.util.*;
public class search_element_in_2D_Array_row_columns_are_sorted {
    // array should have sorted in row wise and column wise
    static boolean search(int[][] arr , int target)
    {
        int st = 0 , end = arr[0].length-1;
        while(st < arr[0].length && end >= 0)
        {
            if(target == arr[st][end])return true;
            else if(target > arr[st][end])
            {
                st++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2 , 4 , 6 , 8 },{5 , 6, 7 , 20 },{7 , 11 , 13 , 25 ,},{12 , 14 , 17 , 20}};
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("Enter the element");
        int target = sc.nextInt();
        System.out.println("is element present in array ? :"+search(arr , target));
    }
}
