package Multi_dimensional_Array;
import java.util.Scanner;
public class multiplication_of_two_matrices {
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
    static void multiply(int[][] arr1 , int[][] arr2,int r1 , int r2 , int c1 , int c2)
    {
        if(c1 != r2)
        {
            System.out.println("Multiplication not possible ");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i = 0 ; i < r1 ; i++)
        {
            for(int j = 0 ; j < c2 ; j++)
            {
                for(int k = 0 ; k < c1 ; k++)
                {
                    ans[i][j] +=(arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of array :");
        output(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and colums of 1st array");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = input(r1,c1);

        System.out.println("Enter the rows and colums of 1st array");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = input(r2,c2);

        System.out.println("first array :");
        output(arr1);
        System.out.println("Second array :");
        output(arr2);
        multiply(arr1 , arr2 , r1 , r2 , c1 , c2);
    }
}
