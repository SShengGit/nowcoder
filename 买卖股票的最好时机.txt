http://www.nowcoder.com/practice/64b4262d4e6d4f6181cd45446a5821ec

思路：采用双指针解决，一个指针记录访问过的最小值，一个指针往后走，记录每个元素与最小值的差，取最大值

public class Solution {
    /**
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        if (prices == null && prices.length == 0) {
            return 0;
        }
        int maxPro = 0; // 记录最大利益
        int min = prices[0]; // 记录最低的价格，默认买入时价格最低
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]); // 记录最小值
            maxPro = Math.max(maxPro, prices[i] - min); // 记录每个元素与最小值的差，取最大值
        }
        return maxPro;
    }
}
