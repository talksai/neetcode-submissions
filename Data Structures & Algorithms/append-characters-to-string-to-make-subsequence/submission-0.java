class Solution {
    public int appendCharacters(String s, String t) {
        int indexs = 0;
        for (char c: s.toCharArray()){
            if(indexs >= t.length())
                return 0;
            if(c == t.charAt(indexs)){
                indexs++;
            }
        }
        return t.length() - indexs;
    }
}