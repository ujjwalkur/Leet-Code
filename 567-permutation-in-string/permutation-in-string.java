class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        if(len1 > len2){
            return false;
        }
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i = 0; i < len1; i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        
        if(match(arr1, arr2)){
            return true;
        }
        
        for(int i = len1; i < len2; i++){
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - len1) - 'a']--;
            
            if(match(arr1, arr2)){
               return true;
            }
            
        }
        
        return false;
    }
    
    boolean match(int[] arr1, int[] arr2){
        
        for(int i = 0; i < 26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}