class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();
        for(char c : s.toCharArray())
       {
        if(c=='('||c=='{'||c=='[')
        st.push(c);
        else if(c==')'||c=='}'||c==']')
        {
            if(st.isEmpty())
            return false;
        char top=st.pop();
        if(c==')' && top!='(')
        return false;
        else if(c=='}' && top!='{')
        return false;
        else if(c==']' && top!='[')
        return false;
        }
       } 
        return st.isEmpty();
    }
}