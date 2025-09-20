class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        Map<Character, String> p2w = new HashMap<>();
        Map<String, Character> w2p = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(p2w.containsKey(ch)){
                if(!p2w.get(ch).equals(word)) {
                    return false;
                }
            } else {
                p2w.put(ch, word);
            }

            if(w2p.containsKey(word)){
                if(w2p.get(word) != ch) {
                    return false;
                }
            } else {
                w2p.put(word, ch);
            }
        }
        return true;
    }
}