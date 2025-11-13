class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        # >= target -> pass
        # [2,3,1,2,4,3]
        #  L.  R
        # update cur_sum
        # sum < target -> pass
        # sum >= target -> evaluate cur_len -> compare & update min_len -> update cur_len (remove first element -> L) -> move L

        left = 0
        min_len = float("inf")
        cur_sum = 0

        for right in range(len(nums)):
            cur_sum += nums[right]
            
            while cur_sum >= target:
                cur_len = right - left + 1
                if cur_len < min_len:
                    min_len = cur_len
                cur_sum -= nums[left]
                left += 1
        
        return min_len if min_len != float("inf") else 0
