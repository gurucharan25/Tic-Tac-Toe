import java.util.Scanner;

public class TicTacToeUC3 {

    public static int getSlotInput(Scanner sc) {
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot; // return the entered value
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create scanner once

        int chosenSlot = getSlotInput(sc); // method call

        System.out.println("You selected slot: " + chosenSlot);

        sc.close(); // close scanner
    }
}