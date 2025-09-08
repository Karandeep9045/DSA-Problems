class Solution {
    public void solveSudoku(char[][] board) {
        rec(board, 0, 0);
    }

    public static boolean rec(char[][] board, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.') {
            return rec(board, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isitsafe(board, row, col, val) == true) {
                    board[row][col] = (char) (val + '0');
                    if (rec(board, row, col + 1))
                        return true;
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public static boolean isitsafe(char[][] board, int row, int col, int val) {
        //row check
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) (val + '0')) {
                return false;
            }
        }
        //column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) (val + '0')) {
                return false;
            }
        }
        //3*3 matrix check
        row = (row / 3) * 3;
        col = (col / 3) * 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] == (char) (val + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

}