import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
          
        
        Stack<Integer> st =  new Stack<>();
        
        for(int i= 2*n-1; i >= 0; i--){
            int val = nums[i % n];
            while(!st.isEmpty() && st.peek() <= val){
                st.pop();
            }
            
            if(i<n){
                nge[i] = st.empty() ? -1 : st.peek();
            }
            
            st.push(val);
        }
        return nge;
    }
}
