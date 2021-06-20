http://www.nowcoder.com/practice/4fe306a84f084c249e4afad5edf889cc

思路：可以将两个字符串想像成两个连续的滑动窗口，并假设这个滑动窗口最大是字符串长度的一半，通过比较两个窗口的内容是否相同，不相同的时候不断从左向右平移，完了之后，还是不相同，这时候就将窗口的大小调小一点，直到找到一个相同的，这个时候窗口的长度×2就是最大字符串的大小


import java.util.*;

public class Solution {

    public int solve (String a) {
        // write code here
        if (a == null || a.length() <= 1) {
            return 0;
        }
        int len = a.length(); // 总长度
        int maxLen = len/2; // 最长重复字符串长度的一半
        char[] str = a.toCharArray();
        for (int i = maxLen; i > 0; i--) { // 最长重复字符串长度递减
            for (int j = 0; j <= len - 2*i; j++) { // 重复字符串长度为双数
                if (check(str, j, i)) {
                    return 2 * i;
                }
            }
        }
        return 0;
    }
    private boolean check(char[] str, int start, int len) {
        for (int i = start; i < start + len; i++) {
            if (str[i] != str[i+len]) { // abcabc 03 14 25
                return false;
            }
        }
        return true;
    }
}