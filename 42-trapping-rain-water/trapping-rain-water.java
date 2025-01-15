class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int left = 1;
        int right = n-2;
        int res = 0;

        int lHeight = height[left - 1];
        int rHeight = height[right + 1];

        while(left <= right){
            if(rHeight <= lHeight){
                res += Math.max(0, rHeight - height[right]);
                rHeight = Math.max(rHeight, height[right]);

                right--;
            }
            else{
                res += Math.max(0, lHeight - height[left]);
                lHeight = Math.max(lHeight, height[left]);

                left++;
            }
        }
        return res;
    }
}