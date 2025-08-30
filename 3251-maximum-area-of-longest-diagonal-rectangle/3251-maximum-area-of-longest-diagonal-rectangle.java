class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        
        int max=0;
        double diag=0.0;
        for(int i=0;i<arr.length;i++)
        {
            int l = arr[i][0];
            int w = arr[i][1];
            double curr=Math.sqrt(l*l + w*w);
            int ar=l*w;
            if(curr>diag)
            {
                diag=curr;
                max=ar;
            }
            else if(curr==diag)
            {
                if(ar>max)
                max=ar;
            }
        }
            return max;
    }
}