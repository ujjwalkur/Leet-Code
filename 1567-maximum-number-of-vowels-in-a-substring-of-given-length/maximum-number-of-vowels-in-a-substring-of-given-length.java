class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int count = 0;
        int maxV = 0;

        Predicate<Character> isVowel = ch -> "aeiou".indexOf(ch) != -1;

        while(j < n){
            if(isVowel.test(s.charAt(j))){
                count++;
            }

            if(j - i + 1 == k){
                maxV = Math.max(maxV, count);

                if(isVowel.test(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return maxV;
    }

    // public boolean isVowel(char ch){
    //     return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
    // }
}