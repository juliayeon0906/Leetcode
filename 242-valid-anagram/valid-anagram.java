class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(Character c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        boolean allZero = true;

        for(int val : map.values()) {
            if(val != 0) {
                allZero = false;
                break;
            }
        }

        return allZero;
    }
}