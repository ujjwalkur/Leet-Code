class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int i;
        int j;
        
        for(i = 0, j = s.length()-1; i < j; i++, j--){
            char left = s.charAt(i);
            char right = s.charAt(j);
         
            if(left != right){
                break;
            }
            
        }
        if(i < j){
            return false;
        }
        return true;
    }
}