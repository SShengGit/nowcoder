http://www.nowcoder.com/practice/28eb3175488f4434a4a6207f6f484f47

思路：对字符数组进行排序，然后只要比较首尾两个字符串即可

public class Solution {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if (strs.length == 0 || strs == null) {
            return "";
        }
        int l = strs.length;
        Arrays.sort(strs);
        int len = Math.min(strs[0].length(), strs[l-1].length());
        int i = 0;
        for (i = 0; i < len; i++) {
            if (strs[0].charAt(i) != strs[l-1].charAt(i)) {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
}