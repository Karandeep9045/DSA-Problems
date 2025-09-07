class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(word.charAt(0) == board[i][j]){
                    boolean ans = rec(board,i,j,word,0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean rec(char[][] board, int cr , int cc , String word, int index){
        if (index == word.length()){
            return true;
        }
        if(cr<0 || cc <0 || cr>=board.length || cc >= board[0].length || board[cr][cc] != word.charAt(index) ){
            return false;
        }

        board[cr][cc] = '*';
        int r[] = {-1,1,0,0};
        int c[] = {0,0,-1,1};

        for(int i =0;i<c.length;i++){
            boolean ans = rec(board,cr+r[i] ,cc+c[i], word,index+1);
            if(ans){
                return true;
            }
        }
        board[cr][cc] = word.charAt(index);
        return false;
    }
}