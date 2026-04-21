import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {


        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol, player2Symbol;
        String currentPlayer;


        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1


        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
        }


        System.out.println("Toss Result: " + toss);
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}