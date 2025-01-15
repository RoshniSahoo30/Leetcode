class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        Deque<Integer> dq=new LinkedList<>();
        int max=0,s=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            while(!dq.isEmpty() && dq.getLast()<num)
            dq.pollLast();
            dq.addLast(num);
            if(i>=k && nums[i-k]==dq.getFirst())
            dq.pollFirst();
            if(i>=k-1)
            res.add(dq.getFirst());

        }
        return res.stream().mapToInt(i->i).toArray();
    }
}