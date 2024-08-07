import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        
        Arrays.fill(nge, -1);
        
        Stack<Integer> st =  new Stack<>();
        
        for(int i=0; i<2*n; i++){
            int val = nums[i % n];
            while(!st.isEmpty() && nums[st.peek()] < val){
                nge[st.pop()] = val;
            }
            
            if(i<n){
                st.push(i);
            }
        }
        return nge;
    }
}
