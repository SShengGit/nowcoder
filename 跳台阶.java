http://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4

思路：自底向上型循环求解。由于它可以跳1级台阶或者2级台阶，所以它上一步必定在第n-1,或者第n-2级台阶，也就是说它跳上n级台阶的跳法数是跳上n-1和跳上n-2级台阶的跳法数之和
设跳上 ii 级台阶有 f(n)f(n) 种跳法，则它跳上n级的台阶有 f(n)=f(n-1) + f(n-2)f(n)=f(n−1)+f(n−2) 种跳法。

然后，我们又思考初始（n-2\leq0n−2≤0）的情况，跳上1级台阶只有1种跳法，跳上2级台阶有2种跳法，最终我们得到如下的递推式
f(n)= 
      1  	,n=1
      2  	,n=2
f(n−1)+f(n−2)   ,n>2
​	

public class Solution {
    public int jumpFloor(int target) {
    if (target <= 1) {
        return 1;
    }
        // a = f(i-1), b = f(i-2) c = f(i) 
        int a = 1, b = 1;
        int c = 0;
        for (int i = 2; i <= target; i++) {
            c = a + b; // f(i) = f(i-1) + f(i-2)
            // 为下一次循环求 f[i + 1] 做准备
            b = a; // f(i-2) = f(i-1)
            a = c; // f(i-1) = f(i)
            
        }
        return c;
    }
}