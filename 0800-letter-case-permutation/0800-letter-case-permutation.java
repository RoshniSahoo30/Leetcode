class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<>();
        //String str="";
        backtrack(s,0,res,s.toCharArray());
        return res;
        
    }
    void backtrack(String s, int idx, List<String> res, char str[])
    {
        if(idx==s.length())
        {
            res.add(new String(str));
            return;
        }
        if(Character.isDigit(str[idx]))
        {
        backtrack(s,idx+1,res,str);
        return;
        }
        str[idx]=Character.toLowerCase(str[idx]);
        backtrack(s,idx+1,res,str);
        str[idx]=Character.toUpperCase(str[idx]);
        backtrack(s,idx+1,res,str);

    }
}