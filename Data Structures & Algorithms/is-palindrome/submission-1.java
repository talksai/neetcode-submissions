class Solution {
    public boolean isPalindrome(String result) {
         result = result.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0, r=result.length()-1;
        System.out.println(result);
        while (l<r){
            if(result.charAt(l)!=result.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
