class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){ // skip special characters
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) { // skip special characters
                right--;
            }
            // if no same letter -> no palindrome.
            if(Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--))){
                return false;
            }
        }
        return true;
    }
}