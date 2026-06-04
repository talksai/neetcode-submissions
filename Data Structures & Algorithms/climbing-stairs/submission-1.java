class Solution {
    private Map<Integer,Integer> map =new HashMap<>();
    public int climbStairs(int n) {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        if(map.containsKey(n))
            return map.get(n);
        int res1 = climbStairs(n-1);
        map.put(n-1,res1);
        int res2 = climbStairs(n-2);
        map.put(n-2,res2);
        return res1 + res2;
    }
}
