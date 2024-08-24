class Solution {
    public int minimumLength(String s) {
        
        int prefix = 0;
        int suffix = s.length() - 1;
        
        while(prefix < suffix && s.charAt(prefix) == s.charAt(suffix)){
            
            char matchChar = s.charAt(prefix);
            
            while(prefix <= suffix && s.charAt(prefix) == matchChar){
                prefix++;
            }
            
            while(prefix <= suffix && s.charAt(suffix) == matchChar){
                suffix--;
            }
        }
        return suffix - prefix + 1;
    }
}