package OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class make_your_arraylist {
    public static class Arraylist{
        int[] arr = new int[5];
        int idx = 0;
        int size = 0;
        public void set(int idx , int ele){
            arr[idx] = ele;
        }
        public void add(int ele)
        {
            if(size == arr.length)
            {
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr,brr.length);
            }
            arr[idx++] = ele;
            System.out.println(arr[--idx]);
            size++;
        }
    }
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(12);
//        a.add(56);
//        System.out.println(a);
        Arraylist arr = new Arraylist();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.set(1 , 20);
        arr.add(5);
        System.out.println(arr.size);
    }
}
