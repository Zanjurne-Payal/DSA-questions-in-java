package array;
import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        //linear search
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("search for :");
        int search = sc.nextInt();
        int ans = -1;
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == search)
            {
                ans = i;
                break;
            }
        }
        if(ans == -1)
        {
            System.out.println("Not found!");
        }
        else{
            System.out.println("you find the element : "+search+" at index of "+ans);
        }
    }
}
