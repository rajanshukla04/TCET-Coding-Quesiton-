package javaP;
import java.util.*;
public class CoinChange {
    public static List<List<Integer>> findCombinations(int[] coins, int sum) {
        Arrays.sort(coins); 
        List<List<Integer>> result = new ArrayList<>();
        backtrack(coins, sum, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private static void backtrack(int[] coins, int remaining, int start, List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
        } else if (remaining < 0) {
            return; 
        } else {
            for (int i = start; i < coins.length; i++) {
                current.add(coins[i]);
                backtrack(coins, remaining - coins[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of coins: ");
       int n = scanner.nextInt();
       int[] coins = new int[n];
       System.out.println("Enter the denominations of the coins: ");
       for (int i = 0; i < n; i++) {
           coins[i] = scanner.nextInt();
       }
       System.out.print("Enter the target sum: ");
       int sum = scanner.nextInt();
       scanner.close();
       List<List<Integer>> combinations = CoinChange.findCombinations(coins, sum);
       System.out.println("Output : ");
       System.out.println( combinations);
          
    }
}
