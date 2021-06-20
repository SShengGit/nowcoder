http://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c

思路：遍历字符串，使用HashMap把出现过的字符和对应的出现次数记录下来，然后再把字符串遍历一次，检测出现次数为1的字符，返回其下标

import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        // 使用map集合存储字符及出现的次数
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.keySet().contains(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }
        // 遍历字符串 找到出现次数为1的字符，并返回下标
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}