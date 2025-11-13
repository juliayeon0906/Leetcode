class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        # {} -> magazine char : count #
        # if ransomNote char contained in {} && count > 0 -> count--
        # else: return false
        # end: return true

        map = {}

        for char in magazine:
            map[char] = 1 + map.get(char, 0)
        
        for char in ransomNote:
            if char not in map or map[char] <= 0:
                return False
            map[char] -= 1

        return True
