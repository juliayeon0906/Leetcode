class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptrS = 0;
        int ptrT = 0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        while(ptrT < t.length() && ptrS < s.length()) {
            if(arr1[ptrS] == arr2[ptrT]) {
                ptrS++;
            }
            ptrT++;
        }
        return ptrS == s.length();
    }
}