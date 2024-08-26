class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        int noOfSubsets = 1 << n;
        
        for(int i = 0; i < noOfSubsets; i++){
            List<Integer> list = new ArrayList<>();
            
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}