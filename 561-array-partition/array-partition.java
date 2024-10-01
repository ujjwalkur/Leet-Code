class Solution {
    public int arrayPairSum(int[] nums) {
        int totalSum = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i = i+2){
            totalSum += nums[i];
        }
        return totalSum;
    }
}

