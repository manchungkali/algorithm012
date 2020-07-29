// class Solution {
//     public int maxProfit(int[] prices) {
//         int res = 0;
//         int len = prices.length;
//         for (int i = 0; i < len-1; i++) {
//             int diff = prices[i+1] - prices[i];
//             if (diff > 0){
//                 res += diff;
//             }
//         }
//         return res;   
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int len = prices.length;
        for (int i = 0; i < len-1; i++) {
            res += Math.max(prices[i+1] - prices[i], 0);
        }
        return res;
    }

}

