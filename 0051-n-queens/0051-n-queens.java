class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        rec(board, 0, n, ans);
        return ans;
    }

    public static void rec(boolean[][] board, int row, int tq, List<List<String>> ans) {
        if (tq == 0) {
            ans.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isitsafe(row, board, col)) {
                board[row][col] = true;
                rec(board, row + 1, tq - 1, ans);
                board[row][col] = false;
            }
        }
    }

    public static boolean isitsafe(int row, boolean[][] board, int col) {
        int r = row - 1;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }

        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static List<String> construct(boolean[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j])
                    sb.append("Q");
                else
                    sb.append(".");
            }
            list.add(sb.toString());
        }
        return list;
    }
}