class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        // If the array is not rotated
        if (nums[end] > nums[0]) {
            return nums[0];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than the end element, the min is in the right part
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } 
            // If mid element is less than the end element, the min is in the left part
            else if (nums[mid] < nums[end]) {
                end = mid;
            } 
            // If mid element is equal to end element, skip the duplicate
            else { 
                end--;
            }
        }

        return nums[start];
    }
}
