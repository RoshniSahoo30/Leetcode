class Solution {
    public int minAddToMakeValid(String s) {
        int op=0,cl=0;
        for(char c: s.toCharArray())
        {
            if(c=='(')
            op++;
            else 
            {if(op>0)
            op--;
            else
            cl++;}
        }
        return op+cl;
    }
}