import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        
        return result;
    }
}
