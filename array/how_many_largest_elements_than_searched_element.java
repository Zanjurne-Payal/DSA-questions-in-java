package array;
import java.util.Scanner;
public class how_many_largest_elements_than_searched_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int n = sc.nextInt();
        int count = 0;
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6};
        for(int  i = 0 ; i < arr.length ; i++)
        {
            if( arr[i] > n)
            {
                count++;
            }
        }
        System.out.println("the largest numbers than "+n+" are: "+count);
    }
}
