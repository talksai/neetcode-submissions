class Solution {
    public boolean isAnagram(String s, String t) {
         if(s == null || t ==null || s.isEmpty() || t.isEmpty() || (s.length()!= t.length())){
            return false;
        }
        Map<Character,Integer> characterMap = new HashMap<>();
        for (int i =0; i<s.length();i++){
            int sVal = characterMap.getOrDefault(s.charAt(i),0) + 1;
            characterMap.put(s.charAt(i),sVal);
            int tVal = characterMap.getOrDefault(t.charAt(i),0) - 1;
            characterMap.put(t.charAt(i),tVal);
        }
        for (Integer i : characterMap.values()){
            if(i != 0)
                return false; 
        }
        return true;

    }
}
