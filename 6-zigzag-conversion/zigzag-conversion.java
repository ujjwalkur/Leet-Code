class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1 || s.length() < numRows){
            return s;
        }
        
        StringBuilder[] sb = new StringBuilder[numRows];
        
        for(int i = 0; i< numRows; i++){
            sb[i] = new StringBuilder();
        }
        
        int currentRow = 0;
        int index = 0;
        boolean goingDown = true;
        
        while(index < s.length()){
            sb[currentRow].append(s.charAt(index));
            index++;
            
            if(goingDown){
                currentRow++;
                if(currentRow == numRows-1)
                    goingDown = false;
            }
            else{
                currentRow--;
                if(currentRow == 0){
                    goingDown = true;
                }
            }
        }
        
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : sb){
            res.append(row);
        }
        
        return res.toString();
    }
}