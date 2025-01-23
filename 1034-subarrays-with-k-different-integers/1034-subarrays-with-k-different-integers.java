class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return cal(nums,k)-cal(nums,k-1);
    }
    public int cal(int nums[],int k)
    {
     HashMap<Integer,Integer> map=new HashMap<>();
     int l=0,r=0,ans=0;
     while(r<nums.length)
     { map.put(nums[r],map.getOrDefault(nums[r],0)+1);
     while(map.size()>k)
     {
        map.put(nums[l],map.get(nums[l])-1);
        if(map.get(nums[l])==0)
        map.remove(nums[l]);
        l++;
     }
     ans+=r-l+1;
     r++;
     }
     return ans;
    }
}