class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash = defaultdict(list)

        for s in strs:
            key = "".join(sorted(s))
            hash[key].append(s)

        return list(hash.values())