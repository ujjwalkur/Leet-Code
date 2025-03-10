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

            int smaller = Math.min(minkIdx, maxkIdx);
            long temp = smaller - cullIdx;

            if(temp <= 0){
                ans += 0;
            }
            else{
                ans += temp;
            }


        }
        return ans;
    }
}