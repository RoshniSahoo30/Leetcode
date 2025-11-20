class Solution {
    public int hIndex(int[] citations) {
        int l = 0, r = citations.length - 1, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int papersWithAtLeastMidCitations = citations.length - mid;
            
            if (citations[mid] >= papersWithAtLeastMidCitations) {
                // We found a valid h-index, but there might be a larger one
                ans = papersWithAtLeastMidCitations;
                r = mid - 1; // Look for potentially larger h-index in left half
            } else {
                // citations[mid] < papersWithAtLeastMidCitations
                // Need more citations, look in right half
                l = mid + 1;
            }
        }
        return ans;
    }
}

public class HIndexII_Corrected {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: [0,1,3,5,6] -> expected: 3
        int[] citations1 = {0, 1, 3, 5, 6};
        System.out.println("Test 1: " + solution.hIndex(citations1) + " (expected: 3)");
        
        // Test case 2: [1,2,100] -> expected: 2
        int[] citations2 = {1, 2, 100};
        System.out.println("Test 2: " + solution.hIndex(citations2) + " (expected: 2)");
        
        // Additional test cases
        int[] citations3 = {0, 0};
        System.out.println("Test 3: " + solution.hIndex(citations3) + " (expected: 0)");
        
        int[] citations4 = {100};
        System.out.println("Test 4: " + solution.hIndex(citations4) + " (expected: 1)");
        
        int[] citations5 = {0, 1, 4, 5, 6};
        System.out.println("Test 5: " + solution.hIndex(citations5) + " (expected: 3)");
        
        // Edge cases
        int[] citations6 = {0, 0, 0, 0};
        System.out.println("Test 6: " + solution.hIndex(citations6) + " (expected: 0)");
        
        int[] citations7 = {1, 1, 1, 1};
        System.out.println("Test 7: " + solution.hIndex(citations7) + " (expected: 1)");
        
        int[] citations8 = {4, 4, 4, 4};
        System.out.println("Test 8: " + solution.hIndex(citations8) + " (expected: 4)");
    }
}