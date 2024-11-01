package binery_search;
import java.util.Scanner;
public class find_max_distance_between_students {
    static boolean isposible(int[] arr , int stud , int mid)
    {
        int kid = 1;
        int lastkid = arr[0];

        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] - lastkid >= mid)
            {
                kid++;
                lastkid = arr[i];

            }
        }
        return kid >=stud;
    }
    static int raceTrack(int[] arr , int stud)
    {
        if(arr.length < stud)return -1;
        int st = 0 , end = 1000000;
        int ans = -1;
        while(st <= end)
        {
            int mid = st + (end-st)/2;
            if(isposible(arr , stud , mid))
            {
                ans = mid;
                st = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1 , 2 , 4 , 8 , 9};
        int stud = 2;
        System.out.println(raceTrack(arr,stud));
    }
}
