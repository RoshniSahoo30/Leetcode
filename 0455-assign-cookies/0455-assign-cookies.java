class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        for(int i=0;i<s.length && c<g.length;i++)
        {
            if(s[i]>=g[c])
            c++;
        }
        return c;
    }
}