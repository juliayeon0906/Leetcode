class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        idx = {}

        for i, num in enumerate(nums):
            if target - num in idx:
                return [i, idx[target - num]]

            idx[num] = i