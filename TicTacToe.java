import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    static String[] board;
    static String turn;

    static String checkWinner() {
        String[] lines = {
                board[0] + board[1] + board[2],
                board[3] + board[4] + board[5],
                board[6] + board[7] + board[8],
                board[0] + board[3] + board[6],
                board[1] + board[4] + board[7],
                board[2] + board[5] + board[8],
                board[0] + board[4] + board[8],
                board[2] + board[4] + board[6]
        };

        for (String line : lines) {
            if (line.equals("XXX")) return "X";
            if (line.equals("OOO")) return "O";
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                return null;
            }
        }

        return "draw";
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
        System.out.println("X will play first. Enter a slot number:");

        while (winner == null) {
            int numInput;

            try {
                numInput = in.nextInt();
                if (numInput < 1 || numInput > 9) {
                    System.out.println("Invalid input; enter a number between 1 and 9:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; enter a number between 1 and 9:");
                in.next(); 
                continue;
            }

            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;
                turn = turn.equals("X") ? "O" : "X";

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; choose another:");
            }
        }

        if (winner.equals("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + " has won!");
        }

        in.close();
    }
}
