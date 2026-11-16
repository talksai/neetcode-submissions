class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length())
            return false;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            int scCount = map.getOrDefault(sc, 0) + 1;
            if (scCount == 0) map.remove(sc);
            else map.put(sc, scCount);
            int tcCount = map.getOrDefault(tc,0);
            tcCount = tcCount-1;
            if(tcCount==0){
                map.remove(tc)  ;
            }else
                map.put(tc,tcCount);
        }
        return map.isEmpty();
    }
}
