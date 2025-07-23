class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {

        Arrays.sort(rides,(a,b)-> a[0]-b[0]);
        long max=0;
        PriorityQueue<long[]> queue =new PriorityQueue<long[]>((a,b) -> Long.compare(a[0],b[0]));
        for(int i=0;i<rides.length;i++){

            int start=rides[i][0];
            int end=rides[i][1];
            long tot=end-start+Long.valueOf(rides[i][2]);

            while(!queue.isEmpty() && start>=queue.peek()[0]){
                max=Math.max(max,queue.peek()[1]);
                queue.poll();
            }
            queue.offer(new long[]{end, tot+max});
        }
        while(!queue.isEmpty()){
            max=Math.max(max, queue.poll()[1]);
        }
        return max;
        
    }
}