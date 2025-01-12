class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        if(nums.length == 0 || nums.length == 1){
            return list;
        }
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) == 2){
                list.add(key);
            }
        }
        return list;
    }    
}