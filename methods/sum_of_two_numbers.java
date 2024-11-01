package methods;
 class working{
     int sum(int a , int b){
         return a+b;
     }
}
public class sum_of_two_numbers {
    public static void main(String[] args) {
        working work = new working();
        int ans1 = work.sum(10,20);
        int ans2 = work.sum(40,90);
        System.out.println("sum of 10 and 20 :"+ans1);
        System.out.println("sum of 40 and 90 :"+ans2);
    }
}
