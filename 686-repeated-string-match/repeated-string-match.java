class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        String newA = a.toLowerCase();
        String newB = b.toLowerCase();
        
        int count = 1;
        int repeat = newB.length()/a.length();
        
        for(int i = 0; i< repeat+2; i++){
            if(a.contains(newB)){
                return count;
            }
            else{
                a+= newA;
                count++;
            }
        }
        return -1;
    }
}