class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            
            if(stack.isEmpty() || stack.peek() != ch){
                
                stack.push(ch);
   
            }
            else{
                
                while (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                }
            }
            
            
            
        }
        for(char ch1 : stack){
                sb.append(ch1);
            }
        return sb.toString();
    }
}




