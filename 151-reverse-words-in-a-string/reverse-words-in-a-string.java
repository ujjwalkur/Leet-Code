class Solution {
    public String reverseWords(String s) {
        
        String[] newString = s.split(" +");
        StringBuilder sb = new StringBuilder();
        
        for(int i = newString.length-1; i >= 0; i--){
            sb.append(newString[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
