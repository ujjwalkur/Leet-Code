class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int countZero = 0;
        int maxLen = 0;

        int i = 0;

        for(int j = 0; j < n; j++){
            if(nums[j] == 0){
                countZero++;
            }

            while(countZero > 1){
                if(nums[i] == 0){
                    countZero--;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j-i);
        }
        return maxLen;
    }

}