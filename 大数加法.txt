http://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475

思路：采用Java的BigInteger大数相加

public class Solution {
    public String solve (String s, String t) {
        // write code here
        BigInteger b1 = new BigInteger(s);
        BigInteger b2 = new BigInteger(t);
        return b1.add(b2).toString();
    }
}