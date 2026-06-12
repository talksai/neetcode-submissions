class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength =Integer.MIN_VALUE;
        int i=0;
        int currentLength  = 0;
        Set<Character> set = new HashSet<>();

        for (int j =0 ;j<s.length();j++){
            currentLength++;
            if(!set.contains(s.charAt(j))){
                maxLength = Math.max(maxLength,currentLength);
                set.add(s.charAt(j));
            }else {
                while (set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                    currentLength--;
                }

                if(set.isEmpty())
                    currentLength = 1;
                set.add(s.charAt(j));
            }
        }
        return maxLength == Integer.MIN_VALUE?0:maxLength;
    }
}
