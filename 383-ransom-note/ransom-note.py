class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        # {} -> magazine char : count #
        # if ransomNote char contained in {} && count > 0 -> count--
        # else: return false
        # end: return true

        map = {}

        for char in magazine:
            map[char] = 1 + map.get(char, 0)
        
        for i in range(len(ransomNote)):
            if ransomNote[i] in map and map.get(ransomNote[i], 0) > 0:
                map[ransomNote[i]] = map.get(ransomNote[i]) - 1
            else:
                return False
        
        return True
        
