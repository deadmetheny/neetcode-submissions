class Solution {
    public int uniquePaths(int m, int n) {
        int[][] solMatrix = new int[m][n];
        for (int[] row: solMatrix){
        Arrays.fill(row, 1);
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                solMatrix[i][j] = solMatrix[i-1][j] + solMatrix[i][j-1];
            }
        }
        return solMatrix[m - 1][n - 1];
        
    }
}