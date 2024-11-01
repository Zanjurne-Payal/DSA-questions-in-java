package Multi_dimensional_Array;
import java.util.Scanner;
public class basic {
    static void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1st method of initiate 2D array
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // 2nd method of initiation {Array literals}
        int[][] arr2 = {
                { 1 , 2 , 3},
                { 4 , 5 , 6},
                { 7 , 8 , 9},
                { 10 , 11 , 12}
        };

        //getting usser input
        System.out.println("Enter the number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr3 = new int[r][c];
        System.out.println("Enter "+r*c+" Elements :");
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                arr3[i][j] = sc.nextInt();
            }
        }
        print(arr3);
    }
}
