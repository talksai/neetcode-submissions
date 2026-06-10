class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> maxHeap =new PriorityQueue<>(Collections.reverseOrder());
        for (int stone: stones){
            maxHeap.offer(stone);
        }
        for (int i = 1; i<stones.length  ; i++){
            if(maxHeap.isEmpty()||maxHeap.size()==1 )
                break;
            int candidateA = maxHeap.poll();
            int candidateB = maxHeap.poll();
            if(candidateB == candidateA)
                continue;
            int res  = Math.abs(candidateA -candidateB);
            maxHeap.offer(res);
        }
        return maxHeap.isEmpty()? 0 : maxHeap.poll();
    }
}
