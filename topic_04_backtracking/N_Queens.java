import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// time complexity: O(n^n)

public class N_Queens {
    // isSafe method
    public static boolean isSafe(char board[][], int row, int col) {
        // horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // save board method
    public static void saveBoard(char board[][], List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // recursive method
    public static void helper(List<List<String>> allBoards, char board[][], int col) {
        // base case
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(allBoards, board, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("n = ");
        //int n = sc.nextInt();

        // boards
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[5][5];

        helper(allBoards, board, 5);
    }
}