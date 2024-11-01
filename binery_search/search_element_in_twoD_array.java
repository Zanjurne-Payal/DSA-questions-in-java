package binery_search;
import java.util.Scanner;
// all elements are in sorted form left to rigth
// last element of 1 st row should be < than next row 1st element
public class search_element_in_twoD_array {
    static boolean search(int[][] arr , int target){
        int n = arr.length , m = arr[0].length;
        int st = 0 , end = (n*m)-1;
        while(st <= end)
        {
            int k = st + end/2;
            int mid = arr[k/m][k%n];
            if(mid == target)return true;
            else if(target > mid)
            {
                st = k+1;
            }
            else{
                end = k-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1 , 3 , 5 , 7},{10 , 11 , 16 , 20},{23 , 30 , 34 , 60}};
        System.out.println("array ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        boolean ans = search(arr , target );
        System.out.println("is element present  "+ans);
    }
}
