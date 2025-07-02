class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;        // number of rows
        int n = grid[0].length;     // number of columns

        int[][] dp = new int[m][n]; // dp[i][j] will store the min path sum to reach cell (i,j)

        dp[0][0] = grid[0][0];      // starting point

        // Fill the first row (can only come from the left)
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill the first column (can only come from the top)
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1]; 
    }
}
