
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    static int moveCount = 0;


    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human player's turn");
                // Human move logic here
            } else {
                System.out.println("Computer player's turn");
                // Computer move logic here
            }

            moveCount++;

            // Check win condition (example)
            if (checkWin()) {
                gameOver = true;
                System.out.println("Game Over! We have a winner.");
            }

            // Check draw condition
            else if (moveCount == 9) {
                gameOver = true;
                System.out.println("Game Over! It's a draw.");
            }

            // Switch turn
            else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }

  
    static boolean checkWin() {
        return false; // replace with actual win-check logic
    }
}