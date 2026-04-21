import java.util.Scanner;

public class TicTacToeUC4 {


    public static int getSlotInput(Scanner sc) {
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }


    public static int[] getRowCol(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chosenSlot = getSlotInput(sc);

        int[] position = getRowCol(chosenSlot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);

        sc.close();
    }
}