class Solution {
    public int findKthLargest(int[] nums, int k) {
          PriorityQueue<Integer> maxHeap =new PriorityQueue<>();
        for (int num : nums){
            maxHeap.offer(num);
            if(k<maxHeap.size())
                maxHeap.poll();
        }
        return maxHeap.isEmpty()?0:maxHeap.poll();
    }
}
