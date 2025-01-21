class Solution {
    public int numberOfSubstrings(String s) {

        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,count=0,n=s.length();
        while(r<s.length())
        {
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0)
            {
                count+=n-r;
                c=s.charAt(l);
                map.put(c,map.get(c)-1);
                l++;
            }
            r++;
        }
        return count;
    }
}