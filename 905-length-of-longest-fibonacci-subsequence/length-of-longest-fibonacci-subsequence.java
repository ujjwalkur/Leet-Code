class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int dp[][] = new int[n][n];
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            map.put(arr[i], i);
        }

        for(int j = 0; j < n; j++){
            for(int k = j + 1; k < n; k++){
                
                int val = arr[j] + arr[k];

                if(map.containsKey(val)){
                    int x = map.get(val);

                    dp[k][x] = Math.max(dp[j][k] + 1, 3);
                    maxLen = Math.max(maxLen, dp[k][x]);
                }
            }
        }
        return maxLen;
    }
}