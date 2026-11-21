class Solution {

    public String encode(List<String> strs) {
         StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
         List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hash = str.indexOf('#', i);                   // end of length prefix
            int len = Integer.parseInt(str.substring(i, hash));
            int start = hash + 1;
            res.add(str.substring(start, start + len));
            i = start + len;                                  // jump to next record
        }
        return res;
    }
}
