class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st=new Stack<>();
        for(int i : asteroids)
        {
            if(i>0)
            st.push(i);
            else
            {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-i)
                st.pop();
                if(st.isEmpty() || st.peek()<0)
                st.push(i);
                if(st.peek()==-i)
                st.pop();
            }
        }
        int ans[]=new int[st.size()];
        int c=st.size()-1;
        while(!st.isEmpty())
            ans[c--]=st.pop();
        return ans;
    }
}