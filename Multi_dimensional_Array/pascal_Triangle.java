package Multi_dimensional_Array;
import java.util.Scanner;
public class pascal_Triangle {
    static int[][] pascal(int[][] arr)
    {
        //example of jagged array which means different size of array in main array
        //like arr[][] = {{1,2,3},{1},{1,2}}
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = new int[i+1]; //initialize the size of jagged array
            arr[i][0] = arr[i][i] = 0;
            for(int j = 0 ; j <= i ; j++)
            {
//                if(j == 0 || j == i)
//                {
//                    arr[i][j] = 1;
//                }
//                else
//                {
                    arr[i][j] = arr[i-1][j-1] +arr[i-1][j];
//                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns :");
        int n = sc.nextInt();
        //int[][] arr = new int[n][n];
        int[][] arr = new int[n][];
        pascal(arr);
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
