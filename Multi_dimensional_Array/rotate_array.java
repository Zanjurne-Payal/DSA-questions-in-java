package Multi_dimensional_Array;

import java.util.Scanner;

public class rotate_array {
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
    static int[] reverse(int[] arr){
        for(int i = 0 ,j = arr.length-1; i < j ; i++ , j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    static int[][] Transpose(int[][] arr, int r , int c){
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
    static int[][] rotate(int[][] arr, int n){
        //my logic usefull but use extra space
//        int k = n-1;
//        int[][] ans = new int[c][r];
//        for(int i = 0 ; i < n ; i++)
//        {
//            for(int j = 0 ; j < n ; j++){
//                ans[j][i] = arr[k][j];
//            }
//            k--;
//        }
//        return ans;
        //widaut using extra array
        Transpose(arr , n , n);
        for(int i = 0 ; i < n ; i++)
        {
            reverse(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colums :");
        int n = sc.nextInt();
        int[][] arr = input( n , n );
        System.out.println("After Rotation Array :");
         //int [][] ans = rotate(arr , n , n);
        rotate(arr,n);
        output(arr);
    }
}
