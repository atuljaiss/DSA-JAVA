class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i =0;i<n;i++){
            pq.offer(arr[i]);
        }
        long res=0;
        while(pq.size()!=1){
            long one = pq.poll();
            long two = pq.poll();
            long sum =one +two;
            pq.offer(sum);
            res+=sum;
        }
        return res;
    }
}