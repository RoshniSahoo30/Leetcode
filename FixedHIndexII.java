/**
 * H-Index II - Corrected Solution
 * 
 * Problem: Given a sorted array of citations, find the researcher's h-index.
 * The h-index is the maximum value h such that the researcher has published 
 * at least h papers that have each been cited at least h times.
 * 
 * Time Complexity: O(log n) - Binary search
 * Space Complexity: O(1) - Constant extra space
 */
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        int maxHIndex = 0;  // FIX: Track maximum h-index found
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int papersFromMid = n - mid; // Number of papers from position mid to end
            
            if (citations[mid] >= papersFromMid) {
                // Found a valid h-index candidate
                maxHIndex = Math.max(maxHIndex, papersFromMid);
                // FIX: Search LEFT for potentially larger h-index (more papers)
                right = mid - 1;  // CORRECTED: was l=mid+1 (wrong direction)
            } else {
                // Current position doesn't satisfy h-index condition
                // FIX: Search RIGHT for fewer papers required  
                left = mid + 1;   // CORRECTED: was r=mid-1 (wrong direction)
            }
        }
        
        return maxHIndex;
    }
}

/* 
BUGS FIXED:

1. CRITICAL BUG - Incorrect Binary Search Direction:
   Original: if(nums[mid]>=c) { l=mid+1; } else { r=mid-1; }
   Fixed:    if(citations[mid]>=papersFromMid) { right=mid-1; } else { left=mid+1; }
   
   Explanation: When we find a valid h-index, we should search LEFT (smaller indices) 
   for potentially larger h-index values, not RIGHT.

2. LOGIC BUG - Missing Maximum Tracking:
   Original: ans=c (only keeps last found value)
   Fixed:    maxHIndex = Math.max(maxHIndex, papersFromMid)
   
   Explanation: We need to track the maximum valid h-index across all iterations.

3. PERFORMANCE/STYLE - Inefficient Variable Usage:
   Original: c=nums.length-mid (recalculated every iteration)
   Fixed:    papersFromMid = n - mid (clearer variable name, calculated once per iteration)
   
   Explanation: Better variable naming and slightly more efficient.

ALGORITHM EXPLANATION:
- For a sorted citations array, at position mid:
  * citations[mid] = citation count at that position
  * n - mid = number of papers from position mid to end (including mid)
- If citations[mid] >= (n-mid), then (n-mid) is a valid h-index
- We want the maximum possible h-index, so we search left for more papers
- Binary search ensures O(log n) time complexity
*/