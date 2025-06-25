class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
        
            if (boxes.charAt(i) == '1') {
                for (
                    int nm = 0;
                    nm < boxes.length();
                    nm++
                ) {
                    ans[nm] += Math.abs(nm - i);
                }
            }
        }
        return ans;
    }
}