class Solution {
    public boolean isSubsequence(String s, String t) {
        // using two pointer
        int ptrS = 0;
        int ptrT = 0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // iterate the characters
        while(ptrT < t.length()){
            // find the matched character in string t
            // if found, we move the ptr S to find next
            if(ptrS < s.length() && arr1[ptrS] == arr2[ptrT]) {
                ptrS++;
            }

            ptrT++;
        }
            
        // return boolean (if the ptr S is pointing to the end of the character in string s)
        return ptrS == s.length();
    }
}