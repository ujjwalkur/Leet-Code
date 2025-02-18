class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int count = 1;
        StringBuilder num = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i <= n; i++){
            st.push(count);
            count++;

            if(i == n || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    num.append(st.pop());
                }
            }
        }
        return num.toString();
    }
}