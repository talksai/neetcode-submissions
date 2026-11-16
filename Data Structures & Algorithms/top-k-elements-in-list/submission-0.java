class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<>();

        for (Integer num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Integer num: map.keySet()){
            heap.add(num);
            if(heap.size()>k)
                heap.poll();
        }
        int [] res = new int[k];
        int index = 0;
        for (Integer num: heap){
            res[index]=num;
            index++;
        }
        return res;
    }
}
