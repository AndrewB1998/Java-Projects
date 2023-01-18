package exercise1;

import fi.utu.tech.exercise1.task1.task3.Age;
import fi.utu.tech.exercise1.task1.task2.ChessBoard;
import fi.utu.tech.exercise1.task1.task3.TicTacToe;
import fi.utu.tech.exercise1.task1.Utilities;
import fi.utu.tech.exercise1.task2.ChessBoard;
import fi.utu.tech.exercise1.task3.Age;
import fi.utu.tech.exercise1.task3.TicTacToe;
import fi.utu.tech.exercise1.task4.Foobar;

public class Main {
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        for (var i : Foobar.foobar(new int[]{5, -6, 6, 6, 2, 3, 3, 3, 1})) {

        }

        System.out.println(Utilities.average(new int[] {1,2,3,4,233}));

        System.out.println(Utilities.rot13("Niin hyvää puuta aAäz"));
        System.out.println(Utilities.toOct(2));
        TicTacToe.drawBoard(new Boolean [4][4]);
        Age.printAge(16,9,-0);
        ChessBoard.printBoard(ChessBoard.createInitialBoard());
        TicTacToe.drawBoard(TicTacToe.board());
    }
}
