class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i: arr)
        {
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        int val=-1;
        for(int key: freq.keySet()){
            if(freq.get(key)==key)
            val=key;
        }
        return val;
    }
}