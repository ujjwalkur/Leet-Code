class Solution {
    public int compress(char[] chars) {
        StringBuilder op = new StringBuilder();
        int i = 0;
        
        if(chars.length == 0 || chars == null){
            return 0;
        }
        
        while(i < chars.length){
            int count = 0;
            char ch = chars[i];
            
            while(i < chars.length && ch == chars[i]){
                count++;
                i++;
            }
            
            op.append(ch);
            if(count > 1){
                op.append(count);
            }
        }
        
        char[] res = op.toString().toCharArray();
        for(int k = 0; k < res.length; k++){
            chars[k] = res[k];
        }
        return op.length();
    }
}