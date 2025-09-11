class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map=new HashMap<>();
    String[] words=paragraph.toLowerCase().replaceAll("[^a-z\\s]", " ").split("\\s+");
    Set<String> ban = new HashSet<>(Arrays.asList(banned));
    String res="";
    int max=0;
    for(String str: words)
    {
        if(!ban.contains(str))
        {
            map.put(str,map.getOrDefault(str,0)+1);
            if(map.get(str)>max)
            {
                max=map.get(str);
                res=str;
            }
        }
    }
        return res;
        
    }
}