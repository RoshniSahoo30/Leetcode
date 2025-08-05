class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int n = fruits.length;
        boolean[] vis = new boolean[n];       
        int c = 0;
         for (int i = 0; i < n; i++) {
            int val = fruits[i];
            boolean f = false;
             for (int j = 0; j < n; j++) {
                  if (!vis[j] && baskets[j] >= val) {
                     vis[j] = true;
                    f = true;
                    break;
                }
            }
            
             if (!f) {
                c++;
            }
        }
        
        return c;
    }
}