class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int majority = 0;
        int res = 0;
        int size = nums.length;

        for(int i = 0; i < size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // save the frequency
            if(map.get(nums[i]) > majority) {
                majority = map.get(nums[i]);
                res = nums[i];
            }
        }
        return res;
    }
}