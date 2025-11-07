class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        char_idx_s = {}
        char_idx_t = {}

        for i in range(len(s)):
            if s[i] not in char_idx_s:
                char_idx_s[s[i]] = i
            
            if t[i] not in char_idx_t:
                char_idx_t[t[i]] = i

            if char_idx_s[s[i]] != char_idx_t[t[i]]:
                return False
        
        return True