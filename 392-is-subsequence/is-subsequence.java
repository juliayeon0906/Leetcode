class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptrS = 0;
        int ptrT = 0;

        while(ptrS < s.length() && ptrT < t.length()) {
            if(s.charAt(ptrS) == t.charAt(ptrT)) {
                ptrS++;
            }
            ptrT++;
        }
        return ptrS == s.length();
    }
}