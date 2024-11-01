package ifElse;
import java.util.Scanner;
public class profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter selling price");
        int sprice = sc.nextInt();
        System.out.println("Enter Cost price");
        int cprice = sc.nextInt();
        if(sprice > cprice){
            int profit = sprice-cprice;
            System.out.println("The profit is rs "+profit);
        }
        else if(cprice > sprice){
            int loss = cprice-sprice;
            System.out.println("The Loss is rs "+loss);
        }
        else{
            System.out.println("You don`t have profit or loss");
        }
    }
}
