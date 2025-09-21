class Solution {
    public boolean isSubsequence(String s, String t) {
        int counterS = s.length() - 1;
        int counterT = t.length() - 1;

        while(counterS >= 0 && counterT >= 0) {            
            if(s.charAt(counterS) == t.charAt(counterT)) {
                counterS--;
            }
            counterT--;
        }
        return counterS < 0;
    }
}