http://www.nowcoder.com/practice/09fbfb16140b40499951f55113f2166c

思路：二分查找。当m*m<=x&&(m+1)*(m+1)>x时，返回结果
当middle*middle < x时，到右半部分继续寻找
当middle*middle > x时，到左半部分继续寻找

public class Solution {
    public int sqrt (int x) {
        // write code here
        if (x <= 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left < right) {
            long mid = (left + right) / 2;
            if (mid * mid <= x && (mid+1) * (mid+1) > x) {
                return (int)mid;
            } else if (mid * mid > x) {
                right = (int)mid;
            } else {
                left = (int)mid;
            }
        }
        return left;
    }
}