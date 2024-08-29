class Solution {
    public List<Integer> grayCode(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        int num = 1 << n;
        
        for(int i = 0; i < num; i++){
            int grayCode = i ^ (i >> 1);
            list.add(grayCode);
        }
        
        return list; 
    }
}

