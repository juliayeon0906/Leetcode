class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            char patChar = pattern.charAt(i);
            if(map1.containsKey(patChar) && !map1.get(patChar).equals(word[i])) {
                return false;
            }
            map1.put(patChar, word[i]);
        }

        for(int i = 0; i < word.length; i++) {
            char patChar = pattern.charAt(i);
            if(map2.containsKey(word[i]) && map2.get(word[i]) != patChar){
                return false;
            }
            map2.put(word[i], patChar);
        }

        return true;
    }
}