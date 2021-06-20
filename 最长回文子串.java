http://www.nowcoder.com/practice/b4525d1d84934cf280439aeecc36f4af
思路：暴力求解，截取字符串的所有子串，判断这些子串中哪些是回文子串，记录最长的子串长度。（对称的字符串称为回文子串）

public class Solution {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            // 截取所有子串，判断并记录长度
            for (int j = i+1; j <= n; j++) {
                String str = A.substring(i, j);
                if (isPalindrome(str) && str.length() > maxLen) {
                    maxLen = str.length();
                }
            }
        }
        return maxLen;
    }
    // 判断子字符串是否是回文子串
    public boolean isPalindrome(String now) {
        int len = now.length();
        for (int i = 0; i < len/2; i++) {
            if (now.charAt(i) != now.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
}