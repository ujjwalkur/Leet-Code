import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuffer> result = new Stack<>();
        StringBuffer current = new StringBuffer();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int count = 0;
               
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                counts.push(count);  

            } else if (ch == '[') {
               
                result.push(current);
                current = new StringBuffer();
                i++; 
            } else if (ch == ']') {
              
                StringBuffer temp = current;
                current = result.pop();
                int count = counts.pop();
               
                for (int j = 0; j < count; j++) {
                    current.append(temp);
                }
                i++;  
            } else {
               
                current.append(ch);
                i++;
            }
        }

        return current.toString();
    }
}
