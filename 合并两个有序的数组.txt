https://www.nowcoder.com/practice/89865d4375634fc484f3a24b7fe65665?tpId=117&&tqId=34943&rp=1&ru=/ta/job-code-high&qru=/ta/job-code-high/question-ranking

思路：采用双指针合并数组，i指针指向B数组末尾的元素，j指针指向A数组末尾的元素，比较AB中的数组，大的放到A数组中

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // A数组足够大，直接合并到A数组中
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 && j >= 0) {
            // 从AB数组中最大的元素开始比较
            A[index--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        // 如果B数组没合并完就直接放到A数组中
        while (j >= 0) {
            A[index--] = B[j--];
        }
    }
}
