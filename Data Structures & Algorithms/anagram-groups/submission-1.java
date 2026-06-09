class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for (String s:strs){
            int[] charCount = new int[26];
            for (char c: s.toCharArray()){
                charCount[c-'a']++;
            }
            String key = Arrays.toString(charCount);
            List<String> val = map.getOrDefault(key,new ArrayList<>());
            val.add(s);
            map.put(key,val);
        }
        return new ArrayList<>(map.values());
    }
}
