class Solution {
    public double myPow(double x, int n) {

       if(n<0)
        return 1.0/cal(x,-n);
        else
        return cal(x,n);
        
    }

    double cal(double num, int pow)
    {
        if(pow==0)
        return 1.0;
        if(pow==1) return num;

        double half=cal(num,pow/2);
        if(pow%2==0)
        return half * half;
        else
        return num * half * half;
    }
}