class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;

        long ans = 0;
        int minkIdx = -1;
        int maxkIdx = -1;
        int cullIdx = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] < minK || nums[i] > maxK){
                cullIdx = i;
            }

            if(nums[i] == minK){
                minkIdx = i;
            }

            if(nums[i] == maxK){
                maxkIdx = i;
            }

            int smallerIdx = Math.min(minkIdx, maxkIdx);

            long temp = smallerIdx - cullIdx;

            ans += (temp <= 0)? 0 : temp;
        }
        return ans;
    }
}