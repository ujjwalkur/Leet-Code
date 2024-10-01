class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                char current = board[i][j];
                
                if(current != '.'){
                    String rowKey = "row" + i + current;
                    String colKey = "col" + j + current;
                    String boxKey = "boxKey" + (i / 3) + (j / 3) + current;
                    
                    if(!set.add(rowKey) || !set.add(colKey) || !set.add(boxKey)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}