class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        idx = {}

        for i in range(len(nums)):
            if nums[i] in idx:
                return [idx[nums[i]], i]
            pair = target - nums[i]
            idx[pair] = i

        return []