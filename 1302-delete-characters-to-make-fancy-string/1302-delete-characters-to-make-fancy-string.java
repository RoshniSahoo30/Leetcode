class Solution {
    public String makeFancyString(String s) {

        if (s == null || s.length() < 3) {
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (i == 0 || curr != s.charAt(i - 1)) {
                c = 1;
                ans.append(curr);
            } else {
                c++;
                if (c < 3) {
                    ans.append(curr);
                }
            }
        }
        return ans.toString();
        
    }
}