class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(map1.containsKey(charS)) {
                if(!map1.get(charS).equals(charT)){
                    return false;
                }
            } else {
                map1.put(charS, charT);
            }

            if(map2.containsKey(charT)) {
                if(!map2.get(charT).equals(charS)){
                    return false;
                }
            } else {
                map2.put(charT, charS);
            }
        }
        return true;
    }
}