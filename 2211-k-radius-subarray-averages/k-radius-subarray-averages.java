import java.util.*;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Fill with -1

        if (k == 0) {
            return Arrays.copyOf(nums, nums.length);
        }

        int len = 2 * k + 1;
        if (n < len) {
            return result; 
        }

        long window_sum = 0;

        for (int j = 0; j < len; j++) {
            window_sum += nums[j];
        }

        result[k] = (int) (window_sum / len); 

        int l = 0;
        int r = len; 

        while (r < n) {
            window_sum = window_sum + nums[r] - nums[l]; 
            result[k + 1] = (int) (window_sum / len);
            l++;
            r++;
            k++;
        }

        return result;
    }
}
