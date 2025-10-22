class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++) {
            char curChar = magazine.charAt(i);
            map.put(curChar, map.getOrDefault(curChar, 0) + 1); // char : # of Char
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char curChar = ransomNote.charAt(i);
            if(!map.containsKey(curChar) || map.get(curChar) == 0){
                return false;
            }
            map.put(curChar, map.get(curChar) - 1);
        }

        return true;
    }
}