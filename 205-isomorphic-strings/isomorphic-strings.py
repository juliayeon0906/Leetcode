class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        seen = {}

        for s_char, t_char in zip(s, t):
            key_s = ("s_char", s_char)
            key_t = ("t_char", t_char)

            if key_s in seen and seen[key_s] != t_char:
                return False
            if key_t in seen and seen[key_t] != s_char:
                return False
            
            seen[key_s] = t_char
            seen[key_t] = s_char
        
        return True