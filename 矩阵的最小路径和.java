http://www.nowcoder.com/practice/7d21b6be4c6b429bb92d219341c4f8bb

思路：这题求的是从左上角到右下角，路径上的数字和最小，并且每次只能向下或向右移动。所以上面很容易想到动态规划求解。我们可以使用一个二维数组dp，dp[i][j]表示的是从左上角到坐标(i，j)的最小路径和。那么走到坐标(i，j)的位置只有这两种可能，要么从上面(i-1，j)走下来，要么从左边（i，j-1）走过来，我们要选择路径和最小的再加上当前坐标的值就是到坐标（i，j）的最小路径。

所以递推公式就是

dp[i][j]=min(dp[i-1][j]+dp[i][j-1])+grid[i][j];

有了递推公式再来看一下边界条件，当在第一行的时候，因为不能从上面走下来，所以当前值就是前面的累加。同理第一列也一样，因为他不能从左边走过来，所以当前值只能是上面的累加。

    public int minPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];
        //第一列只能从上面走下来
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + matrix[i][0];
        }
        //第一行只能从左边走过来
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + matrix[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //递推公式，取从上面走下来和从左边走过来的最小值+当前坐标的值
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }