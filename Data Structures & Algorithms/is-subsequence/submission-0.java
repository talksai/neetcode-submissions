class Solution {
    public boolean isSubsequence(String s, String t) {
         int indexs = 0;
        for (char c: t.toCharArray()){
            if(indexs >= s.length())
                return true;
            if(c == s.charAt(indexs)){
                indexs++;
            }
        }
        return indexs >= s.length();
    }
}