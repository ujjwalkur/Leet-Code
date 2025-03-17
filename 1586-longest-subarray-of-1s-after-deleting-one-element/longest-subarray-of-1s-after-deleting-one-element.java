class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int result = 0;
        int zeroIdx = -1;

        while(j < n){
            if(nums[j] == 0){
                i = zeroIdx+1;
                zeroIdx = j;
            }

            result = Math.max(result, j-i);
            j++;
        }
        return result;

    }

}