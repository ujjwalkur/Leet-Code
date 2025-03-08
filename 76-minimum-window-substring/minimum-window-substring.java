class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int m = s.length();
        int n = t.length();

        if(n > m){
            return "";
        }

        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int start_i = 0;
        int requiredCount = n;
        int windowSize = Integer.MAX_VALUE;

        while(j < m){
            char ch = s.charAt(j);

            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    requiredCount--;
                }
                map.put(ch, map.get(ch) - 1);
            }
            
            while(requiredCount == 0){
                int currentWindowSize = j - i + 1;

                if(windowSize > currentWindowSize){
                    windowSize = currentWindowSize;
                    start_i = i;
                }

                char leftChar = s.charAt(i);

                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);

                    if(map.get(leftChar) > 0){
                        requiredCount++;
                    }
                }

                i++;
            }

            j++;
        }

        return windowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + windowSize);
    }
}