package Multi_dimensional_Array;
import java.util.Scanner;
public class generate_Spiral_Matrices {
    static void output(int[][] arr ,int r , int c){
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }
    }
    static int[][] Spiral(int r ,int c){
        int topRow = 0 , rightColumn = c-1 , bottomRow = r-1 , leftColumn = 0;
        int[][] arr = new int[r][c];
        int i = 1;
        while(i <= r*c)
        {
            //top row
            for(int j = leftColumn ; j <= rightColumn && i <= r*c ; j++)
            {
                arr[topRow][j] = i++;
            }
            topRow++;
            //right Column
            for(int j = topRow ; j <= bottomRow && i <= r*c ; j++)
            {
                arr[j][rightColumn] = i++;
            }
            rightColumn--;
            //bottom row
            for(int j = rightColumn ; j >= leftColumn && i <= r*c ; j--)
            {
                arr[bottomRow][j] = i++;
            }
            bottomRow--;
            //left Column
            for(int j = bottomRow ; j >= topRow && i <= r*c ; j--)
            {
                arr[j][leftColumn] = i++;
            }
            leftColumn++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c = sc.nextInt();
        int[][] arr = Spiral( r , c);
        output(arr ,r , c);
    }
}
