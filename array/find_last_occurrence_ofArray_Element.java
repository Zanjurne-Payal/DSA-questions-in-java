package array;
import java.util.Scanner;
public class find_last_occurrence_ofArray_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        int n = sc.nextInt();
        int ind = -1;
        int[] arr = { 2 , 3 , 5 , 3 , 7 , 8 , 3};
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == n)
            {
                ind = i;
            }
        }
        if(ind >= 0)  System.out.println("the last occurrence of element "+n+" is at index "+ ind);
        else System.out.println("The element does not found");
    }
}
