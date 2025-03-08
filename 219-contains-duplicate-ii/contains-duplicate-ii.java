class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;

        while(j < n){

            if(set.contains(nums[j])){
                return true;
            }

            set.add(nums[j]);

            if(j-i >= k){
                set.remove(nums[i]);
                i++;
            }

            j++;

        }
        return false;
    }
}