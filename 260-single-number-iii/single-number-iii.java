class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans.add(entry.getKey());
            }
        }
        
        int[] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}