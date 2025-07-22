class Solution {
    public void rotate(int[][] matrix) {

        int n=matrix.length;
        int start=0, end=n-1;

        while(start < end){
            for(int i=0;i<n;i++){
                int tmp=matrix[start][i];
                matrix[start][i]=matrix[end][i];
                matrix[end][i]=tmp;
            }
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        
    }
}