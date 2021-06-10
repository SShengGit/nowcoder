http://www.nowcoder.com/practice/37548e94a270412c8b9fb85643c8ccc2

思路：采用字符替换的方法，把()[]{}替换为空字符串，比较替换前后字符串长度，不相等表示有效替换 返回true，相等表示剩下的字符不合法，无效替换 返回false

public class Solution {
    public boolean isValid (String s) {
        // write code here
        boolean flag = true;
        while (flag) {
            int len = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            if (s.length() == len) {
                flag = false;
            }
        }
        return s.length() == 0;
    }
}

