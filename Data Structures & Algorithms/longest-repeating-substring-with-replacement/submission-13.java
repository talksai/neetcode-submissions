class Solution {
    public int characterReplacement(String s, int k) {
         int l =0;
        int maxLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int r = 0 ;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            int len = (r-l)+1;
            int maxPerson = maxCount(map);
            if((len - maxPerson) <=k){
                maxLength = Math.max(maxLength,len);
            }else {
                while ((len - maxPerson) > k){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    l++;
                    maxPerson = maxCount(map);
                    len = (r-l)+1;;
                }
            }
        }
        return maxLength;
    }
    public int maxCount(Map<Character,Integer> map) {
        int maxpersion = 0;
        for (char c: map.keySet()){
            maxpersion = Math.max(maxpersion,map.get(c));
        }
        return maxpersion;
    }
}
