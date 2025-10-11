class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // since input is sorted -> sorting is unnecessary
        // Using the two pointers (1: beginning of the array, 2: end of the array)
        int ptr1 = 0;
        int ptr2 = numbers.length - 1;

        // iterate arr until first pointer is greater than equal to second ptr
        while(ptr1 < ptr2) {
            // if the sum is greater than target -> decrease ptr2
            int sum = numbers[ptr1] + numbers[ptr2];
            if(sum > target) {
                ptr2--;
            } else if(sum < target) {            // if the sum is less -> increase ptr1
                ptr1++;
            } else { // if the sum is equal -> return the ptr to int array
                return new int[]{ptr1 + 1, ptr2 + 1};
            }
        }

        // return empty otherwise
        return new int[]{};
    }
}