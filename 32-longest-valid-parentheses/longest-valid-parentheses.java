class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    int length = i - stack.peek();
                    count = Math.max(count, length);
                }
            }
        }
        return count;
    }
}