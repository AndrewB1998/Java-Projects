package fi.utu.tech.exercise1.task1.task3;


public class TicTacToe {
    /**
     * Prints a tic-tac-toe board.
     * True = 'x', FALSE = 'o', null = '.'
     */
    public static void drawBoard(Boolean[][] board) {
        if (board.length >3 || board.length <3) {
            System.out.println("Lauta on suurempi/pienempi kuin 3x3");


        }
        else {
            for (var row : board) {
                System.out.println();
                for (var c : row) {
                    if (c == null) {
                        System.out.print('.');
                    } else if (c == true) {
                        System.out.print('x');
                    } else if (c == false) {
                        System.out.print('o');
                    }

                }
            }
            System.out.println("");
        }
    }

    public static Boolean[][] board() {
        Boolean[][] board = {
                {true,false,true},
                {false,false,null},
                {null,true,null}};

        return board;
    }
}


