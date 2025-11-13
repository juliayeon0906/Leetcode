class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_hash = {}
        t_hash = {}

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in s_hash:
                s_hash[s[i]] = i
            
            if t[i] not in t_hash:
                t_hash[t[i]] = i
            
            if s_hash[s[i]] != t_hash[t[i]]:
                return False

        return True