class Solution {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
         for (int Bill : bills) {
            if (Bill == 5) 
                five++;
             else if (Bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else 
                    return false;
                
            } else { 
                if (ten > 0 && five > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) 
                    five -= 3;
                 else 
                    return false;
                
            }
        }
        return true;
    }
}