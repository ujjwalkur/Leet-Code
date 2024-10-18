class Solution {
    
    int[] original;
    int[] current;
    
    private Random random;

    public Solution(int[] nums) {
        original = nums.clone();
        current = nums.clone();
        random = new Random();
    }
    
    public int[] reset() {
        current = original.clone();
        return current;
    }
    
    public int[] shuffle() {
        for(int i = 0; i < current.length; i++){
            int randomIndex = i + random.nextInt(current.length - i);
            
            int temp = current[i];
            current[i] = current[randomIndex];
            current[randomIndex] = temp;
        }
        return current;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */