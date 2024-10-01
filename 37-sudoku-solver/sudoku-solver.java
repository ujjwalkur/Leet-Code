class Solution {
    public void solveSudoku(char[][] board) {
       solve(board);
    }
    
    public boolean solve(char[][] board){
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < board.length; j++){
                
                if(board[i][j] == '.'){
                    
                    for(char num = '1'; num <= '9'; num++){
                        if(isValid(board, i, j, num)){
                            board[i][j] = num;
                            
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char board[][], int row, int col, char num){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == num){
                return false;
            }
        }
        
        for(int j = 0; j < 9; j++){
            if(board[j][col] == num){
                return false;
            }
        }
        
        int rowBox = (row / 3) * 3;
        int colBox = (col / 3) * 3;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[rowBox + i][colBox + j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}













