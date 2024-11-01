package Multi_dimensional_Array;
import java.util.Scanner;
public class Addition_of_matrices {
    static int[][] input( int r , int c){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static int[][] output(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        return arr;
    }
    static int[][] add(int[][] arr1, int[][] arr2,int r , int c)
    {
        int[][] ans = new int[r][c];
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of matrices :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter "+ r*c +" elements of array 1");
        int[][] arr1 = input( r , c);
        System.out.println("Enter "+ r*c +" elements of array 2");
        int[][] arr2 = input( r , c);
        System.out.println("1st array :");
        output(arr1);
        System.out.println("Second array :");
        output(arr2);
        System.out.println("Addition of 2 Arrays is :");
        int[][] ans = add(arr1 , arr2 , r , c);
        output(ans);
    }
}
