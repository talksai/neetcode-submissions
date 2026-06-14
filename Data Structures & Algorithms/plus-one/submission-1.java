class Solution {
    public int[] plusOne(int[] digits) {
        long base = 1;
        long res = 0;
        for (int i = digits.length-1;i>=0;i--){
            res = res+ (base*digits[i]);
            base = base*10;
        }
        System.out.println(res);
        res++;
        List<Long> ress = new ArrayList<>();
        while (res>0){
            ress.addFirst(res %10);
            res = res/10;
        }
        int[] resss = new int[ress.size()];
        for (int i =0;i<resss.length;i++){
            resss[i] = Integer.parseInt(String.valueOf(ress.get(i)));
        }
        return resss;
    }
}
