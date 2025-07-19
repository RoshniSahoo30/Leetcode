class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max=0,l=0;
        Set<Character> map=new HashSet<>();
        for(int r=0;r<s.length();r++)
        {
            if(!map.contains(s.charAt(r)))
            {
                map.add(s.charAt(r));
                max=Math.max(max,r-l+1);
            }
            else
            {
                while(map.contains(s.charAt(r)))
                {
                    map.remove(s.charAt(l));
                    l++;
                }
                map.add(s.charAt(r));
            }
        }
        return max;
        
    }
}