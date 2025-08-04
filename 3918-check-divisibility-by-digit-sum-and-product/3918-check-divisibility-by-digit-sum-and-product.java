class Solution {
    public boolean checkDivisibility(int n) {

        int f=1,s=0;
        for (int i=n;i!=0;i/=10)
        {
            s=s+(i%10);
            f=f*(i%10);
        }

        return n%(s+f)==0;
        
    }
}