import java.util.*;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1]; 
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u'); 
        
        for (int i = 0; i < n; i++) {
            if (isVowelString(words[i], vowels)) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }

        int m = queries.length;
        int[] result = new int[m];
        
        for (int i = 0; i < m; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefix[ri + 1] - prefix[li];
        }
        
        return result;
    }

    private boolean isVowelString(String s, List<Character> vowels) {
        return vowels.contains(s.charAt(0)) && vowels.contains(s.charAt(s.length() - 1));
    }
}
