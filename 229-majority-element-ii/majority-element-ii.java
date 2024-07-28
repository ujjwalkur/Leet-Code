class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int min = (int) (nums.length / 3)+1;
        
        for(int i = 0; i < nums.length; i++){
            int val = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], val+1);
            
            if(mp.get(nums[i]) == min){
                list.add(nums[i]);
            }
            
            if(list.size() == 2){
                break;
            }
        }
        return list;
    }
}