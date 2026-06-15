class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
            if(map.containsKey(s1.charAt(i)) && map.get(s1.charAt(i))==0){
                map.remove(s1.charAt(i));
            }
            if(map.containsKey(s2.charAt(i)) &&map.get(s2.charAt(i))==0){
                map.remove(s2.charAt(i));
            }
        }
        if(map.isEmpty())
            return true;
        for (int i = s1.length();i<s2.length();i++){
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
            char key = s2.charAt(i - s1.length());
            map.put(key,map.getOrDefault(key,0)+1);
            if(map.containsKey(key) &&map.get(key)==0){
                map.remove(key);
            }
            if(map.containsKey(s2.charAt(i)) &&map.get(s2.charAt(i))==0){
                map.remove(s2.charAt(i));
            }
            if(map.isEmpty())
                return true;
        }
        return map.isEmpty();
    }
}
