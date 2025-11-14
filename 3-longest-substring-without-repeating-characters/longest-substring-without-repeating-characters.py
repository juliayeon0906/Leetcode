class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = {}
        longest = 0
        left = 0

        for right, c in enumerate(s):
            if c in seen and seen[c] >= left:
                left = seen[c] + 1
            
            longest = max(longest, right - left + 1)

            seen[c] = right

        return longest