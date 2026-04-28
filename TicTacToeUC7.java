import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';


    public static void main(String[] args) {
        computerMove();
        printBoard();
    }


    static void computerMove() {
        Random random = new Random();

        while (true) {
            int slot = random.nextInt(9) + 1; // random number between 1 and 9

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Check if the slot is empty
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed at slot: " + slot);
                break;
            }
        }
    }


    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}