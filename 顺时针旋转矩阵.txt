http://www.nowcoder.com/practice/2e95333fbdd4451395066957e24909cc

思路：顺时针旋转90°=先沿着右上-左下对角线翻转，再沿着水平中线上下翻转（先沿着 左上-右下对角线翻转，再沿着竖线左右翻转）

public class Solution {
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        // 沿着左上 - 右下对角线翻转元素 
        // 沿着竖线左右翻转元素
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
        return mat;
    }
}