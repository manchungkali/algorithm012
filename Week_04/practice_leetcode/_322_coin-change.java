import java.util.Arrays;

class Solution {
    int ans = 0;
    public int coinChange(int[] coins, int amount) {
        ans = amount + 1;
        Arrays.sort(coins);
        dfs(coins, coins.length - 1, amount, 0);
        return ans == amount + 1 ? -1 : ans;
    }
    public void dfs(int[] coins, int index, int amount, int cnt ) {
        //跳出条件
        if (index < 0) {
            return;
        }
        for (int c = amount / coins[index]; c >= 0; c--) {
            int remainingAmount = amount - c * coins[index];
            int coinsUsed = cnt + c;
            if (remainingAmount == 0) {
                ans = Math.min(ans, coinsUsed);
                break;
            }
            if (coinsUsed + 1 >= ans) {
                break;
            }
            dfs(coins, index - 1, remainingAmount, coinsUsed);
        }



    }



}