class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Stack <Integer> st = new Stack<>();
        int nextgreat [] = new int [n2];
        
        for(int i=n2-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            } 
            
            if(st.isEmpty())
                nextgreat[i] = -1;
            else 
                nextgreat[i] = st.peek();
            
            st.push(nums2[i]);
        }
        
        int arr[] = new int[n1];
        
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
        {
            if(nums1[i] == nums2[j])
            {
                arr[i] = nextgreat[j];
            } 
        }
        }
        //System.out.println(nextgreat[1]);
        return arr;
    }
}