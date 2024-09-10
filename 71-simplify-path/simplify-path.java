class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();
        
        for(String ch : str){
            if(ch.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(!ch.equals("") && !ch.equals(".")){
                stack.push(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(String dir : stack){
            sb.append("/").append(dir);
        }
        
        return sb.length() > 0 ? sb.toString() : "/";
    }
}