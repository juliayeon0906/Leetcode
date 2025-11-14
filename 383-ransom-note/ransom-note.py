class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        hash = {}

        for c in magazine:
            hash[c] = 1 + hash.get(c, 0)
        
        for c in ransomNote:
            if c not in hash or hash[c] <= 0:
                return False
            hash[c] -= 1

        return True