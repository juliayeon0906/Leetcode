class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        // [2,2,1,2] - val = 1
        //        i
        //.     k = 2;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++; // in place replacement
            }
        }

        return k;
    }
}