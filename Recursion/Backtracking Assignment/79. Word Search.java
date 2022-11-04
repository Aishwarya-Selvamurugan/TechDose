class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char c = board[i][j];
                if(board[i][j] == word.charAt(0) && helper(board,word,i,j,1)){
                    return true;
                    }
                board[i][j] = c;
            }
        }
        return false;
    }
    public boolean helper(char[][] board,String word,int r,int c,int index)
    {
        board[r][c] = '1';
        if(index == word.length())
        {
            return true;
        }
        for(int i=0;i<4;i++)
        {
            int x = r+dx[i];
            int y = c+dy[i];
            if(Valid(board,x,y))
            {
                char ch = board[x][y];
                if(word.charAt(index) == board[x][y] && board[x][y] != '1')
                {
                    if(helper(board,word,x,y,index+1))
                    {
                        return true;
                    }
                    else
                    {
                        board[x][y] = ch;
                    }
                }
            }
        }
        return false;
    }
    public boolean Valid(char[][] board,int x,int y)
    {
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length) return true;
        return false;
        
    }
}
