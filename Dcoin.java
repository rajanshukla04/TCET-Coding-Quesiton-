import java.util.Scanner;

public class Dcoin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of Coin");
        int n=input.nextInt();
        int coin[]=new int[n];
        System.out.println("Enter the coin");
        for(int i=0;i<n;i++){
            coin[i]=input.nextInt();
        }
        System.out.println("Enter the amount ");
        int amount=input.nextInt();
        // dp 
        int dp[]=new int[amount+1];
        dp[0]=1;
        for(int i=0;i<coin.length;i++){
            for(int j=coin[i];j<dp.length;j++){
                dp[j]+=dp[j-coin[i]];
            }
        }
    System.out.println("Number of way to return the "+amount+" is "+dp[amountl]);
    }
}
