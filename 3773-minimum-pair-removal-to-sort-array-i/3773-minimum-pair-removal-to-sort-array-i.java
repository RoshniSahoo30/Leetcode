class Solution {
    public int minimumPairRemoval(int[] nums) {

        int count=0;
        List<Integer> list=new ArrayList<>();
        for(int i:nums)
        list.add(i);

        while(true){
        if(check(list))
        return count;

        int sum=Integer.MAX_VALUE,c=0;
        for(int i=0;i<list.size()-1;i++)
        {
            int curr=list.get(i) + list.get(i + 1);
            if(curr<sum){
                sum=curr;
                c=i;
            }

        }
            int tot=list.get(c)+list.get(c+1);
            list.remove(c+1);
            list.set(c,tot);

        count++;
    }
    }
    private boolean check(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}