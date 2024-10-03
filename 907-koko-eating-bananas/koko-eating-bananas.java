class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = maxElement(piles);
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            int totalHr = totalHours(piles, mid);
            
            if(totalHr <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    public int totalHours(int[] arr, int h){
        int totalHr = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            totalHr += Math.ceil((double)(arr[i]) / (double)(h));
        }
        return totalHr;
    }
    
    public int maxElement(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
}