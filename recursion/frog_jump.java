package recursion;
public class frog_jump {
    static int best(int[] arr , int n , int idx){
        if(idx == n-1) return 0;
        int op1 = Math.abs(arr[idx+1] - arr[idx]) + best(arr , n , idx+1);
        if(idx == n-2) return op1;
        int op2 = Math.abs(arr[idx+2] - arr[idx]) + best(arr , n , idx+2);
        return Math.min(op1 , op2);
    }
    public static void main(String[] args) {
        int[] arr = {10 , 30 , 40 , 20};
        System.out.println(best(arr , arr.length , 0));
    }
}
//Algorithm
// array elements are stones cost a frog want to go on n-1 stone
// for that frog can be jump on index+1 or index+2 stone
// for one time jumping frog have to pay cost arr[index+1]-arr[index] or arr[index+2]-arr[index]
// we have to find minimum cost to pay
