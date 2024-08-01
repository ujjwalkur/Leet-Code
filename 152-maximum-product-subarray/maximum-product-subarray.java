class Solution {
    public int maxProduct(int[] nums) {
        
        double maxi = nums[0];
        double pre = 1; 
        double suff = 1;
        
        for(int i = 0; i < nums.length; i++){
            
            if(pre == 0){
                pre = 1;
            }
            
            if(suff == 0){
                suff = 1;
            }
            
            pre *= nums[i];
            suff *= nums[nums.length-i-1];
            
            maxi = Math.max(maxi, Math.max(pre, suff));
        }
        return (int)maxi;
    }   
}