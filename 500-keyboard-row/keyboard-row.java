class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        ArrayList<String> result = new ArrayList<>();
        
        for(String word : words){
            String lowercasewords = word.toLowerCase();
            char firstword = lowercasewords.charAt(0);
            
            String targetrow = row1.contains(String.valueOf(firstword))? row1 : row2.contains(String.valueOf(firstword))? row2 : row3;
            
            boolean isValid = true;
            
            for(char c : lowercasewords.toCharArray()){
                if(!targetrow.contains(String.valueOf(c))){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}