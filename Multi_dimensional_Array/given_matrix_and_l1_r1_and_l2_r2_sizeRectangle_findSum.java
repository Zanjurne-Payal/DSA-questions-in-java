package Multi_dimensional_Array;
import java.util.Scanner;
public class given_matrix_and_l1_r1_and_l2_r2_sizeRectangle_findSum {
    static int[][] input(int r , int c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements");
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
    static void output(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
    }
    static void prefixSum(int[][] arr ){
        int r = arr.length;
        int c = arr[0].length;
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 1 ; j < c ; j++)
            {
                arr[i][j] += arr[i][j-1];
            }
        }
    }
    static void Column_prefixSum(int[][] arr ){
        int r = arr.length;
        int c = arr[0].length;
        for(int i = 0 ; i < c ; i++)
        {
            for(int j = 1 ; j < r ; j++)
            {
                arr[j][i] += arr[j-1][i];
            }
        }
        output(arr);
    }
    static int sum_of_rectangle_under_matrix(int[][] arr , int r1 , int r2 , int c1 , int c2){
        int sum = 0;

        //brute force Method

//        if( r1 < 0 || r2 < 0 || c1 > c || c2 > c )
//        {
//            System.out.println("wrong input");
//        }
//        else
//        {
//            for(int i = r1 ; i <= r2 ; i++)
//            {
//                for(int j = c1 ; j <= c2 ; j++)
//                {
//                   sum += arr[i][j];
//                }
//            }
//        }


        // optimize code

//            prefixSum(arr);
//            for(int i = r1 ; i <= r2 ; i++) {
//                if (c1 > 0)
//                {
//                    sum += arr[i][c2] - arr[i][c1-1];
//                }
//                else
//                {
//                    sum += arr[i][c2];
//                }
//            }


        //best way
//        int total = 0 , up = 0 , left = 0 , leftUp = 0;
        prefixSum(arr);
        Column_prefixSum(arr);
//
//        total = arr[r2][c2];
//        left = arr[r2][c1 - 1];
//        up = arr[r1 - 1][c2];
//        leftUp = arr[r1 -1 ][ c1 -1 ];
//        sum = total + up + left + leftUp;
        if(r1 == 0 && c1 == 0) sum = arr[r2][c2];
        else if(r1 > 0 && c1 == 0)sum = arr[r2][c2] - arr[r1-1][c2];
        else if(r1 == 0 && c1 >0)sum = arr[r2][c2] - arr[r2][c1-1];
        else {
            sum = (((arr[r2][c2] - arr[r1-1][c2]) - arr[r2][c1-1]) + arr[r1-1][c1-1]);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix :");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns of matrix :");
        int c = sc.nextInt();
        int[][] arr = input(r , c);
        System.out.println(" Enter the l1 r1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println(" Enter the l2 r2 :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        output(arr);
        System.out.println("Sum = "+sum_of_rectangle_under_matrix(arr , r1 , r2 , c1 , c2));
    }
}
