class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int maxCount = 0;
        int[] count = new int[26];
        
        for(int end = 0; end < n; end++){
            char ch = s.charAt(end);
            count[ch - 'A']++;
            
            maxCount = Math.max(maxCount, count[ch - 'A']);
            
            int replacement = (end - start + 1) - maxCount;
            
            while(replacement > k){
                char leftChar = s.charAt(start);
                count[leftChar - 'A']--;
                start++;
                maxCount = findMax(count);
                
                replacement = (end - start + 1) - maxCount;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
        
    }
    
    public int findMax(int[] count){
        int maxCount = 0;
        
        for(int i = 0; i < 26; i++){
            maxCount = Math.max(maxCount, count[i]);
        }
        return maxCount;
    }
}