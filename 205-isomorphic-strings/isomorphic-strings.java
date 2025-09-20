class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!map1.containsKey(charS)) {
                map1.put(charS, i);
            }
            if(!map2.containsKey(charT)) {
                map2.put(charT, i);
            }
            if(!map1.get(charS).equals(map2.get(charT))){
                return false;
            }
        }
        return true;
    }
}