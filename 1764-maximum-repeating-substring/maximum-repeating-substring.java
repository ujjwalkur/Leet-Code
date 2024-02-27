class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int count = 0;
        String newWord = word;
        
        while(sequence.contains(newWord)){
            newWord += word;
            count++;
        }
        return count;
    }
}