class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int res = 0;
        int majority = 0;

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > majority) {
                res = nums[i];
                majority = map.get(nums[i]);
            }
        }

        return res;
    }
}