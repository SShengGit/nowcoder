http://www.nowcoder.com/practice/e297fdd8e9f543059b0b5f05f3a7f3b2

思路：判断字符串是否对称即可

import java.util.*;


public class Solution {
    public boolean judge (String str) {
        // write code here
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }
}