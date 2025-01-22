class Solution {
    public int maxScore(int[] c, int k) {
        int leftSum = 0, rightSum = 0, n = c.length, result = 0;
        for (int i = 0; i < k; i++) {
            leftSum += c[i];
        }
        result = leftSum; 
        int r = n - 1; 
        for (int j = k - 1; j >= 0; j--) {
            leftSum -= c[j]; 
            rightSum += c[r]; 
            r--; 
            result = Math.max(result, leftSum + rightSum); 
        }
        return result;
    }
}
