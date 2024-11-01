package Multi_dimensional_Array;
import java.util.Scanner;
public class Transpose_of_matrices {
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
    static int[][] output(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
        return arr;
    }
    static int[][] Transpose(int[][] arr, int r , int c){
        //extra array it is usefull for different size array like 2*3 , 4*2
//        int[][] ans = new int[c][r];
//        for(int i = 0 ; i < c ; i++)
//        {
//            for(int j = 0 ; j < r ; j++)
//            {
//                   ans[i][j] = arr[j][i];
//            }
//        }
//        return ans;
        //not external array   in this method only squre matrix are swap like 3*3 or 4*4
        for(int i = 0 ; i < c ; i++)
        {
            for(int j = i ; j < r ; j++)
            {
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int[][] arr = input( r, c );
        System.out.println("Origional Array :");
        output(arr);
        System.out.println("After Transpose Array :");
        int[][] ans = Transpose(arr , r , c);
        output(ans);
    }
}
