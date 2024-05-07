class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int elm = 0;
        
        for(int i = 0; i< nums.length; i++){
            if(cnt == 0){
                cnt = 1;
                elm = nums[i];
            }
            else if(nums[i] == elm){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == elm){
                count++;
            }
            
            if(count > nums.length / 2){
                return elm;
            }
        }
        return -1;
    }
}