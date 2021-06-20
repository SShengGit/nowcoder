http://www.nowcoder.com/practice/4f470d1d3b734f8aaf2afb014185b395

思路：二分查找（折半查找），每次查找后更新最大值或最小值


public class Solution {
    public int search (int[] nums, int target) {
        // write code here
        int low = 0, mid = 0;
        int high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2; // 取首尾元素的中间值
            if (nums[mid] == target) {
                while (mid != 0 && nums[mid] == nums[mid - 1]) { // 取值为target的第一个元素下标
                    mid--;
                }
                return mid;
            }
            else if (nums[mid] > target) { // 猜测值比目标值大，首元素变为中间值的前一位
                high = mid - 1;
            } else { // 猜测值比目标值小，尾元素变为中间值的后一位
                low = mid + 1; 
            }
        }
        return -1;
    }
}