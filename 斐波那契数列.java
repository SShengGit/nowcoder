https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?answerType=1&f=discussion

思路：斐波那契数列的标准公式为：F(0)= 0,F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）

递归优化
public class Solution {
    public int Fibonacci(int n) {
        int ans[] = new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2;i<=n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}