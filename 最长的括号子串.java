http://www.nowcoder.com/practice/45fd68024a4c4e97a8d6c45fc61dc6ad

思路：采用左右两个计数器left和right记录左右括号的数量。首先从左往右遍历字符串，当左右括号数量相等为有效子串，记录长度，当右括号数量比左括号多为不合法子串，计数器归零，同时左括号数量比右括号多也是非法字符，从右往左遍历字符串即可

import java.util.*;


public class Solution {
    /**
     * 
     * @param s string字符串 
     * @return int整型
     */
    public int longestValidParentheses (String str) {
        // write code here
        int left = 0, right = 0, maxLength = 0;
        // 从左往右遍历字符串
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) { // 左右括号数量相等为有效括号子串
                maxLength = Math.max(maxLength, 2 * right);
            } else if (left < right) { // 右括号比左括号多 无效，重新计数
                left = right =  0;
            }
        }
        left = right =  0;
        // 补充左括号始终比右括号多的情况
        // 从右往左遍历字符串
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxLength = Math.max(maxLength, 2 * left);
            } else if (left > right) {
                left = right =  0;
            }
        }
        return maxLength;
    }
}