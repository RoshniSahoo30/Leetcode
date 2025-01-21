class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, ml = 0, mf = 0;
        int[] hash = new int[26]; 
        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            mf = Math.max(mf, hash[s.charAt(r) - 'A']);
            if ((r - l + 1) - mf > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            ml = Math.max(ml, r - l + 1);
            r++;
        }
        return ml;
    }
}
