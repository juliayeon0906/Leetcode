class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash = {}
        
        for str in strs:
            sort = "".join(sorted(str))
            hash.setdefault(sort, []).append(str)

        return list(hash.values())