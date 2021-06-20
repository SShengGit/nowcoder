http://www.nowcoder.com/practice/c3a6afee325e472386a1c4eb1ef987f3

思路：开辟一个和目标字符串长度大小相同的字符串ans，把目标字符串倒序拼接到ans字符串上。

public class Solution {
    /**
     * 反转字符串
     * @param str string字符串 
     * @return string字符串
     */
    public String solve (String str) {
        // write code here
        StringBuffer sb = new StringBuffer();
        for (int i = str.length(); i > 0; i--) {
            sb.append(str.charAt(i - 1));
    }
        return sb.toString();
    }
}