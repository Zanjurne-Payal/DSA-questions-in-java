package array;
import java.util.Scanner;
class demoa{
    void demo() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " th element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements are :");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"    ");
        }

        //foreach loop
        for(int value : arr){
            System.out.print(value+"    ");
        }

        //while loop
        int i = 0;
        while(i<arr.length){
            System.out.print(arr[i]+"  ");
            i++;
        }
    }
    void multiArray(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        //for loop
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("printing array");
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
        }

    }
}
public class use_loops_array {
    public static void main(String[] args){
        demoa obj = new demoa();
        //obj.demo();
        obj.multiArray();
    }
}
