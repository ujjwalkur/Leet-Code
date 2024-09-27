class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int maxcount = 0;
        
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeros++;
            }
            
            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxcount = Math.max(maxcount, right - left + 1);
        }
        return maxcount;
    }
}