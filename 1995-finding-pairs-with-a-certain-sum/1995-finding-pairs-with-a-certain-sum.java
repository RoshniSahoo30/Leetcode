class FindSumPairs {

    int nums1[];
    int nums2[];
    Map<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {

        this.nums1=nums1;
        this.nums2=nums2;
        this.map=new HashMap<>();
        for(int i: nums2)
        map.put(i, map.getOrDefault(i,0)+1);
    }
    
    public void add(int index, int val) {
        
        int nm = nums2[index];
        map.put(nm, map.get(nm) - 1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        
        int ans = 0;
        for (int num : nums1) {
            int rest = tot - num;
            ans += map.getOrDefault(rest, 0);
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */