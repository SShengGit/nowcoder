http://www.nowcoder.com/practice/c4c488d4d40d4c4e9824c3650f7d5571

思路：借助数组，数组长度设置为二者相乘之后可能产生的最长的位数，即二者位数之和。然后按照乘法规则，逐个位置相乘，求出保留数和进位。一次整体的内循环过程就是求一个中间结果的过程，外循环遍历完，则所有的中间结果也就求完了。最终还需要判断最后的进位变量是否不为0，如果不为0，需要添加到最高位。

public class Solution {
    public String solve (String s, String t) {
        // write code here
        if (s.length() == 0 || t.length() == 0) {
            return "0";
        }
        
        String temp1 = s.length() >= t.length() ? s : t;
        String temp2 = s.length() >= t.length() ? t : s;
        
        StringBuffer long_str = new StringBuffer(temp1).reverse();
        StringBuffer short_str = new StringBuffer(temp2).reverse();
        
        int m = s.length();
        int n = t.length();
        int[] nums = new int[m+n]; // 建立数组存放乘积
        
        int up = 0;
        for (int i = 0; i < short_str.length(); i++) {
            int k = i;
            up = 0;
            for (int j = 0; j < long_str.length(); j++) {
                int num1 = short_str.charAt(i) - '0';
                int num2 = long_str.charAt(j) - '0';
                int count = num1 * num2 + up + nums[k]; // 两数相乘加上进位数和该位置上的数
                up = count / 10; // 求进位
                nums[k] = count % 10; // 求个位数
                k++;
            }
            nums[k] = up; // 乘完一轮后进位数加到下一位
        }
        
        if (up != 0) { // 判断最后的进位变量是否不为0,如果不为0，需要添加到最高位。
            nums[m+n-1] = up;
        }
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        String res = sb.reverse().toString();
        if (res.charAt(0) == '0') {
            return res.substring(1);
        } else {
            return res;
        }
    }
}