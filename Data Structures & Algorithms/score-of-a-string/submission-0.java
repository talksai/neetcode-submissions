class Solution {
    public int scoreOfString(String s) {
        int res = 0; 
        for (int i =1 ;i< s.length(); i++){
            int resCurr = Math.abs(s.charAt(i) - s.charAt(i-1));
            res = resCurr +res;
        }
        return res;
    }
}