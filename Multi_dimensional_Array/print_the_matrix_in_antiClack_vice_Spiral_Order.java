package Multi_dimensional_Array;

import java.util.Scanner;

public class print_the_matrix_in_antiClack_vice_Spiral_Order {
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
    static void Spiral(int[][] arr , int r , int c){
        int topRow = 0 , rightColumn = c-1 , bottomRow = r-1 , leftColumn = 0;
        int i = 0;
        // while(topRow < bottomRow && leftColumn < rightColumn)
        while(i < r*c)
        {
            // left column
            for(int j = topRow ; j <= bottomRow && i < r*c; j++)
            {
                System.out.println(arr[j][leftColumn]+"  ");
                i++;
            }
            leftColumn++;
            // bottom row
            for(int j = leftColumn; j <= rightColumn && i < r*c; j++)
            {
                System.out.println(arr[bottomRow][j]+"  ");
                i++;
            }
            bottomRow--;
            //right column
            for(int j = bottomRow ; j >= topRow && i < r*c; j--)
            {
                System.out.println(arr[j][rightColumn]+"  ");
                i++;
            }
            rightColumn--;
            //top row
            for(int j = rightColumn; j >= leftColumn && i < r*c; j--)
            {
                System.out.println(arr[topRow][j]);
                i++;
            }
            topRow++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows  :");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c = sc.nextInt();
        //int[][] arr = new int[n][n];
        int[][] arr = input(r , c);
        output(arr);
        Spiral(arr , r , c);
    }
}
