class Solution {
    public int maxLength(int[] nums) {
     int n = nums.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            int gcd = nums[i];
            int lcm = nums[i];

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = lcm(lcm, nums[j]);

                if (prod == (long) gcd * lcm) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;   
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}