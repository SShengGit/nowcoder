http://www.nowcoder.com/practice/bb1615c381cc4237919d1aa448083bcc

思路：暴力求解

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算模板串S在文本串T中出现了多少次
     * @param S string字符串 模板串
     * @param T string字符串 文本串
     * @return int整型
     */
    public int kmp (String S, String T) {
        // write code here
        // 暴力解法
        int shortLen = S.length();
        int longLen = T.length();
        int temp = 0;
        for (int i = 0; i <= longLen - shortLen; i++) {
            if (S.equals(T.substring(i, shortLen + i))) {
                temp++;
            }
        }
        return temp;
    }
}