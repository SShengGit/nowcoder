http://www.nowcoder.com/practice/ef1f53ef31ca408cada5093c8780f44b

思路：遍历两次数组，第一次只添加奇数到新数组里，第二次只添加偶数到新数组里

public class Solution {
    public int[] reOrderArray (int[] array) {
        // write code here
        int len = array.length;
        int[] ans = new int[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 != 0) {
                ans[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                ans[index] = array[i];
                index++;
            }
        }
        return ans;
    }
}