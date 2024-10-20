class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        
        product[0] = 1;
        
        for(int i=1; i<n; i++){
            product[i] = product[i-1] * nums[i - 1];
        }
        
        int right = 1;
        for(int j = n-1; j >= 0; j--){
            product[j] *= right;
            right *= nums[j];
        }
    return product;
    }
}