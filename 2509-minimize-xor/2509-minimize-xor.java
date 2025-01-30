public class Solution {

    public int minimizeXor(int num1, int num2) {
        int result = 0;

        int target = Integer.bitCount(num2);
        int set = 0;
        int curr = 31; 
        while (set < target) {
         
            if (isSet(num1, curr) ||(target - set > curr)
            ) {
                result = setBit(result, curr);
                set++;
            }
            curr--; 
        }

        return result;
    }
 private boolean isSet(int x, int bit) {
        return (x & (1 << bit)) != 0;
    }
  private int setBit(int x, int bit) {
        return x | (1 << bit);
    }
}