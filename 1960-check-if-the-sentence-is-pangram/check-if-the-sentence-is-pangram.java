class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] result = new boolean[26];
        
        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            
            if(Character.isAlphabetic(ch)){
                ch = Character.toUpperCase(ch);
                int index = ch - 'A';
                result[index] = true;
            }
        }
        for(boolean val : result){
            if(val == false){
                return false;
            }
        }
        return true;
    }
}