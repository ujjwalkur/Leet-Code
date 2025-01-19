class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int pair = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'L'){
                pair++;
            }
            else if(ch == 'R'){
                pair--;
            }

            if(pair == 0){
                count++;
            }
        }
        return count;
    }
}