http://www.nowcoder.com/practice/20ef0972485e41019e39543e8e895b7f

思路：双重for循环遍历元素求和，等于目标值则记录其下标并加一，放入数组

public class Solution {
    /**
     * 
     * @param numbers int整型一维数组 
     * @param target int整型 
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                }
            }
        }
        return res;
    }
}