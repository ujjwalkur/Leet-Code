class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum = 0;
        int rSum = 0;
        int maxi = 0;

        for(int i = 0; i < k; i++){
            lSum += cardPoints[i];
        }

        maxi = lSum;
        int ptr = n-1;

        for(int i = k-1; i>= 0; i--){
            lSum -= cardPoints[i];
            rSum += cardPoints[ptr];
            ptr--;

            maxi = Math.max(maxi, lSum + rSum);
        }
        return maxi;
    }
}
