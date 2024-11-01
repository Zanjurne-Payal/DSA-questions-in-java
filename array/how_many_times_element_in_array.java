package array;
import java.util.Scanner;
public class how_many_times_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which numbers occurance would you like to find");
        int n = sc.nextInt();
        int[] arr = new int[10];
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(i+1 +" element : ");
            arr[i] = sc.nextInt();
            if(arr[i] == n)
            {
                count++;
            }
        }
        System.out.println("The ocurance of "+n+" is : "+count);
    }
}
