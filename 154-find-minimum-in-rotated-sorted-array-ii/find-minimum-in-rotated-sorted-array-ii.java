class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        if (nums[end] > nums[0]) {
            return nums[0];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

         
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } 
            
            else if (nums[mid] < nums[end]) {
                end = mid;
            } 
            
            else { 
                end--;
            }
        }

        return nums[start];
    }
}
