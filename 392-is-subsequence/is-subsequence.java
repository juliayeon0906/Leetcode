class Solution {
    public boolean isSubsequence(String s, String t) {
        // using two pointer
        int ptrS = 0;
        int ptrT = 0;

        // iterate the characters
        while(ptrT < t.length()){
            // find the matched character in string t
            // if found, we move the ptr S to find next
            if(ptrS < s.length() && s.charAt(ptrS) == t.charAt(ptrT)) {
                ptrS++;
            }

            ptrT++;
        }
            
        // return boolean (if the ptr S is pointing to the end of the character in string s)
        return ptrS == s.length();
    }
}