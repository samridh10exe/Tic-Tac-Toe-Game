//Samridh
import java.util.Scanner;
public class TicTacToe {

    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        drawBoard();
        playGame();
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void drawBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("| ");
        }
        System.out.println("-------------");
    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);
        boolean gameFinished = false;

        while (!gameFinished) {
            System.out.println("Player " + currentPlayer + ", enter a row (0-2):");
            int row = input.nextInt();
            System.out.println("Enter a column (0-2):");
            int col = input.nextInt();

            if (isValid(row, col)) {
                board[row][col] = currentPlayer;
                drawBoard();

                if (isWinner()) {
                    System.out.println("Congratulations, Player " + currentPlayer + " has won!");
                    gameFinished = true;
                } else if (isTie()) {
                    System.out.println("It's a tie!");
                    gameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, please try again.");
            }
        }
    }

    public static boolean isValid(int row, int col) {
        if (row < 0 || row > 2) {
            return false;
        } else if (col < 0 || col > 2) {
            return false;
        } else if (board[row][col] != '-') {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    public static boolean isTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}