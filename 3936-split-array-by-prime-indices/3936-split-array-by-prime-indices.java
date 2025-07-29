class Solution {
    public long splitArray(int[] nums) {

        long sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(i))
            sum1+=nums[i];
            else
            sum2+=nums[i];
        }
        return Math.abs(sum1-sum2);
    }

    boolean isPrime(int n)
    {
        if (n <= 1) return false; 
        if (n == 2) return true;  
        if (n % 2 == 0) return false; 
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}