class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char n=board[i][j];
                    if((!hs.add(n+"in row "+i))||(!hs.add(n+"in column "+j))||(!hs.add(n+"in block "+i/3+"-"+j/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}