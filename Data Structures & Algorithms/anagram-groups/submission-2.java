class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> map = new HashMap<>();
        for (String s: strs){
            int[] count = new int[26];
            for (char c: s.toLowerCase().toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }
}
