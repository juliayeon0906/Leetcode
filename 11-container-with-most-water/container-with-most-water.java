class Solution {
    public int maxArea(int[] height) {
        // Using two pointers
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        // iterates until left ptr is larger than right ptr
        while(left < right) {
            // compare area of container
            // area = width * height
            int width = right - left;
            int h = Math.min(height[right], height[left]);
            int area = width * h;
            // if it is larger than 'max' value than it updates the 'max'
            max = Math.max(max, area);
            // and we move the left OR right ptr if the one is smaller than the other one.

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        // return 'max'
        return max;
    }
}