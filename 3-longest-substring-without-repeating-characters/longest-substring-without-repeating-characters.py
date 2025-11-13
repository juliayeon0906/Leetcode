class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # [a, b, c, a, b, c, b, b]
        #  L
        #           R
        # iteration:
        # if s[R] in seen -> seen removes s[left] -> L move
        # update seen set
        # compare & update longest


        left = 0
        longest = 0
        seen = set()

        for right in range(len(s)):
            while s[right] in seen:
                seen.remove(s[left])
                left += 1
            seen.add(s[right])
            longest = max(longest, right-left+1)
        
        return longest
            
