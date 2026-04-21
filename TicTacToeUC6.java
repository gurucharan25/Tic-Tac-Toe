import java.util.Scanner;

public class TicTacToeUC6 {


    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }


    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }


    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        printBoard(board);


        System.out.print("Enter row (0-2): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-2): ");
        int col = sc.nextInt();


        if (isValidMove(board, row, col)) {
            placeMove(board, row, col, 'X'); // place symbol
            System.out.println("Move placed!");
        } else {
            System.out.println("Invalid move!");
        }

        printBoard(board);

        sc.close();
    }
}