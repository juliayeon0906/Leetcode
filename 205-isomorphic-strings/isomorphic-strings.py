class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        seen = {}

        for s_char, t_char in zip(s, t):
            if s_char in seen:
                if seen[s_char] != t_char:
                    return False
            elif t_char in seen.values():
                return False
            seen[s_char] = t_char
        
        return True