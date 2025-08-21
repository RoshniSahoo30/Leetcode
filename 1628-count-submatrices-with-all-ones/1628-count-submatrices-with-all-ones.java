class Solution {
    public int numSubmat(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] += mat[i - 1][j];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int minHeight = mat[i][j];
                for (int k = j; k < n; k++) {
                    minHeight = Math.min(minHeight, mat[i][k]);
                    count += minHeight;
                }
            }
        }
        
        return count;
    }
}